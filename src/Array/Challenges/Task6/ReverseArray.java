// Create a program to reverse an array
package Array.Challenges.Task6;

public class ReverseArray {
    public static void main(String[] args){
        System.out.println("Welcome to Array Reversal");
        int[] numArray = ReverseArrayUtility.inputArray();
        reverse(numArray);
        System.out.println("Your Reverse Array is: ");
        ReverseArrayUtility.displayArr(numArray);

    }
    public static void reverse(int[] arr){
        int i = 0;
        while (i< arr.length/2){
            int swap = arr[i];
            arr[i]=arr[(arr.length-1)-i];
            arr[(arr.length-1)-i]=swap;
            i++;
        }
    }
}
