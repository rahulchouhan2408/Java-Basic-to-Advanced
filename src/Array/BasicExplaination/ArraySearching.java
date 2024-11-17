package Array.BasicExplaination;

import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] Search = {1,6,89,4,63,7,5,45,62,75,78,99,100};
        System.out.print("Please enter the number you want to search: ");
        int think = input.nextInt();
        boolean isFound = SearchFound(Search, think);
        if(isFound){
            System.out.println("Your Number is found in Array.");
        }else {
            System.out.println("Your Number is not found in Array.");
        }
    }
    public static boolean SearchFound(int[] Search, int think){
        int index = 0;
        while (index<Search.length){
            if(Search[index]==think){
                return true;
            }
            index++;
        }
            return false;
    }
}
