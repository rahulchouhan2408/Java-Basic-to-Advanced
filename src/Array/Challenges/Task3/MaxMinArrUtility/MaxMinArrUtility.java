package Array.Challenges.Task3.MaxMinArrUtility;

import java.util.Scanner;

public class MaxMinArrUtility {
    public static int[] inputArray(){
        Scanner Arr = new Scanner(System.in);
        System.out.print("Please enter the number of elements: ");
        int Size = Arr.nextInt();
        int[] MyArr = new int[Size];
        int i = 0;
        while(i<Size){
            System.out.print("Please enter the element number "+(i+1)+":");
            MyArr[i]=Arr.nextInt();
            i++;
        }
        return MyArr;


    }
}
