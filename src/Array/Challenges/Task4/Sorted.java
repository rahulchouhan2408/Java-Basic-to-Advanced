//Create a Program to check If the given Array is Sorted
package Array.Challenges.Task4;

public class Sorted {
    public static void main(String[] args){
        int[] numsArray = SortedUtility.inputArray();
        boolean isInc = isIncreasing(numsArray);
        boolean isDec = isDecreasing(numsArray);
        if(isInc||isDec){
            System.out.println("Your Array is Sorted");
        }else{
            System.out.println("Your Array is Not Sorted");
        }
    }
    public static boolean isIncreasing(int[] numArray){
        int i =1;
        while(i< numArray.length){
            if(numArray[i]<numArray[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isDecreasing (int[] numArray){
        int i = 1;
        while (i< numArray.length){
            if(numArray[i]>numArray[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
