package Array.Challenges.Task11;

import java.util.Scanner;

public class DiagonalUtility {
    public static int[] inputArray() {
        Scanner arr = new Scanner(System.in);
        System.out.print("Please enter the number of elements: ");
        int size = arr.nextInt();
        int[] myArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Please enter element number " + (i + 1) + ": ");
            myArray[i] = arr.nextInt();
        }

        return myArray;
    }

    public static int[][] input2DArray() {
        Scanner myArray = new Scanner(System.in);
        System.out.print("Please enter the number of rows: ");
        int rows = myArray.nextInt();
        System.out.print("Please enter the number of columns: ");
        int columns = myArray.nextInt();

        int[][] numArray = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Please enter row " + (i + 1) + ", column " + (j + 1) + ": ");
                numArray[i][j] = myArray.nextInt();
            }
        }

        return numArray;
    }

    public static void displayArray(int[] numArray) {
        for (int value : numArray) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}