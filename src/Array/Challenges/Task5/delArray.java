// create a program to return a new array deleting a specific element.
package Array.Challenges.Task5;

import Array.Challenges.Task2.Occurences;

import java.util.Scanner;

public class delArray {
    public static void main(String[] args) {
    Scanner delete = new Scanner(System.in);
    System.out.println("Welcome to Array deletion");
    int[] numArray = delArrayUtility.inputArray();
        System.out.print("Please enter the number you want to delete: ");
        int numToDelete = delete.nextInt();
        int[] newArray = deleteNumber(numArray,numToDelete);
        System.out.print("Here is your new Array: ");
        delArrayUtility.displayArr(newArray);
    }
    public static int[] deleteNumber(int[] numArray, int numToDelete){
        int Occ = Occurences.noOfOccurences(numArray, numToDelete);
        if(Occ == 0){
            return numArray;
        }
        int newSize = numArray.length-Occ;
        int[] newArr = new int[newSize];
        int i = 0, j=0;
        while (i<numArray.length){
            if(numArray[i] != numToDelete){
                newArr[j] = numArray[i];
                j++;
            }
            i++;
        }
            return newArr;
    }
}
