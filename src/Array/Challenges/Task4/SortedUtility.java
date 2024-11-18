package Array.Challenges.Task4;

import java.util.Scanner;

public class SortedUtility {
    public static int[] inputArray(){
        Scanner Arr = new Scanner(System.in);
        System.out.print("Please enter the number of elements: ");
        int Size = Arr.nextInt();
        int[] Sort = new int[Size];
        int i = 0;
        while(i<Size){
            System.out.print("Please enter the element number "+(i+1)+": ");
            Sort[i]=Arr.nextInt();
            i++;
        }
        return Sort;
    }
}
