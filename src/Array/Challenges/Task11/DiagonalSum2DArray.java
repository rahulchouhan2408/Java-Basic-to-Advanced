//Create a Program to find the sum of two diagonal elements.
package Array.Challenges.Task11;

public class DiagonalSum2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Diagonal Sum");
        int[][] numArr = DiagonalUtility.input2DArray();
        long sum = SumOfDiagonal(numArr);
        System.out.println("Sum of diagonal is: " + sum);
    }

    public static long SumOfDiagonal(int[][] numArray) {
        long leftSum = SumOfLeftDiagonal(numArray);
        long rightSum = SumOfRightDiagonal(numArray); // Call the right diagonal sum method
        long sum = leftSum + rightSum; // Use the rightSum variable

        // If the matrix size is odd, subtract the middle element (which is counted twice)
        if (numArray.length % 2 != 0) {
            int ind = numArray.length / 2;
            sum -= numArray[ind][ind];
        }
        return sum;
    }

    public static long SumOfLeftDiagonal(int[][] numArray) {
        long sum = 0;
        for (int i = 0; i < numArray.length; i++) {
            sum += numArray[i][i];
        }
        return sum;
    }

    public static long SumOfRightDiagonal(int[][] numArray) {
        long sum = 0;
        for (int i = 0; i < numArray.length; i++) {
            int col = numArray.length - 1 - i;
            sum += numArray[i][col];
        }
        return sum;
    }
}