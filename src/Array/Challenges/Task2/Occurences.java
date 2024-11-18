//Create a Program to find number of Occurences Of an element in an array.
package Array.Challenges.Task2;

import java.util.Scanner;

public class Occurences {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Occurences");
        int[] OccurArray = OcuurencesUtility.inputArray();
        System.out.print("Please enter the number you want to find: ");
        int num = input.nextInt();
        int NoOfTimes = noOfOccurences(OccurArray, num);
        System.out.println("Your number found "+NoOfTimes+" times in Array.");
    }
    public static int noOfOccurences(int[] OccurArray, int num){
        int occ = 0;
        int i = 0;
        while (i< OccurArray.length){
            if(OccurArray[i]== num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
