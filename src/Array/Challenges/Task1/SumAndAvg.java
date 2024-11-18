package Array.Challenges.Task1;

public class SumAndAvg {
    public static void main(String[] args){
        System.out.println("Welcome to Sum and Average Finder.");
        int[] myArray = SumAndAvgUtility.inputArray();
        long Sum = Sum(myArray);
        System.out.println("Sum of your Array is: "+Sum);
        int Avg = Avg(myArray);
        System.out.println("Average of your number is: "+Avg);
    }
    public static long Sum(int[] numArray){
        int sum = 0;
        int i =0;
        while(i< numArray.length){
            sum += numArray[i];
            i++;
        }
        return sum;
    }
    public static int Avg(int[] numArray){
        long Avg = Sum(numArray);
        return (int)(Avg/ numArray.length);
    }

}
