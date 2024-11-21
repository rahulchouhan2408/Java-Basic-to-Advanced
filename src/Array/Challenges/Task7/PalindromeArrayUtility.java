package Array.Challenges.Task7;

import java.util.Scanner;

public class PalindromeArrayUtility {
    public static int[] inputArray(){
        Scanner Arr = new Scanner(System.in);
        System.out.print("Please enter the number of elements: ");
        int Size = Arr.nextInt();
        int[] myArray = new int[Size];
        int i = 0;
        while(i<Size){
            System.out.print("Please enter the element number "+(i+1)+":");
            myArray[i]=Arr.nextInt();
            i++;
        }
        return myArray;
    }
}
