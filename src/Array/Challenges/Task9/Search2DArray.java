package Array.Challenges.Task9;

import java.util.Scanner;

public class Search2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Use the utility class to input a 2D array
        int[][] numArr = SearchUtility.input2DArray();

        System.out.print("Now, enter the number you want to search: ");
        int num = input.nextInt();

        boolean isfound = search(numArr, num); // Correctly reference numArr
        if (isfound) {
            System.out.println("Your number was found.");
        } else {
            System.out.println("Your number was not found.");
        }

        input.close(); // Close the scanner to prevent resource leaks
    }

    public static boolean search(int[][] numArr, int num) {
        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr[i].length; j++) {
                if (numArr[i][j] == num) {
                    return true;
                }
            }
        }
        return false;
    }
}
