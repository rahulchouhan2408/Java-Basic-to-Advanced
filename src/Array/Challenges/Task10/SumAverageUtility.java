package Array.Challenges.Task10;

import java.util.Scanner;

public class SumAverageUtility {
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
    public static int[][] input2DArray(){
        Scanner MyArray = new Scanner(System.in);
        System.out.print("Please enter the number of rows: ");
        int rows = MyArray.nextInt();
        System.out.print("Please enter the number of Columns: ");
        int columns = MyArray.nextInt();
        int[][] numArray = new int [rows][columns];
        int i = 0;
        while(i<rows){
            int j=0;
            while (j<columns){
                System.out.print("Please enter the rows: "+(i+1)+" Columns: "+(j+1)+":");
                numArray[i][j]= MyArray.nextInt();
                j++;
            }
            i++;
        }
        return numArray;
    }
    public static void displayArray(int[] numArray){
        int i = 0;
        while(i< numArray.length){
            System.out.print(numArray[i]+" ");
            i++;
        }
        System.out.println();
    }
}
