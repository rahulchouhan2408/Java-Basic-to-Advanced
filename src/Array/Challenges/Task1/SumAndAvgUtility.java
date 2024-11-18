// this class asked you to Array Size then tell you to fill the elements number
package Array.Challenges.Task1;

import java.util.Scanner;

public class SumAndAvgUtility {
    public static int[] inputArray(){
        Scanner Arr = new Scanner(System.in);
        System.out.print("Please enter the number of elements: ");
        int size = Arr.nextInt();
        int[] num = new int[size];
        int i = 0;
        while(i<size){
            System.out.print("Please enter the element number "+(i+1)+": ");
            num[i]= Arr.nextInt();
            i++;
        }
        return num;
    }
}
