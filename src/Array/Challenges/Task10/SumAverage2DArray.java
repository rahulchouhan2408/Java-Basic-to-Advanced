package Array.Challenges.Task10;

public class SumAverage2DArray {
    public static void main(String[] args){
        System.out.println("Welcome to Sum and Average 2D Array");
        int[][] numArray = SumAverageUtility.input2DArray();
        long Sum = Sum(numArray);
        double avg = average(numArray);
        System.out.println("Your Sum of array is: "+Sum);
        System.out.println("Your average of array is: "+avg);
    }
    public static long Sum(int[][] numArr){
        long Sum = 0;
        int i = 0;
        while(i< numArr.length){
            int j = 0;
            while(j<numArr[i].length){
                Sum += numArr[i][j];
                j++;
            }
            i++;
        }
        return Sum;
    }
    public static double average(int[][] numArr){
        if(numArr.length==0){
            return 0;
        }
        int rows = numArr.length;
        int cols = numArr[0].length;
        double Size = rows * cols;
        return Sum(numArr)/Size;
    }
}
