package Array.Challenges.Task2;

import java.util.Scanner;

public class OcuurencesUtility {
    public static int[] inputArray(){
        Scanner Arr = new Scanner(System.in);
        System.out.print("Please enter the number of elements: ");
        int number = Arr.nextInt();
        int[] myArray = new int[number];
        int i = 0;
        while(i<number){
            System.out.print("Please enter the number of elements "+(i+1)+":");
            myArray[i]=Arr.nextInt();
            i++;
        }
        return myArray;

    }
}
