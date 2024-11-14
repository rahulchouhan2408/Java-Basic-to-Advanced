//create a program to sum all odd number from1 to a specified number N.
package Loops.WhileLoops;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        Scanner odd = new Scanner (System.in);
        System.out.print("Please enter your number: ");
        int sum = odd.nextInt();
        AddOddSum(sum);
    }
    public static void AddOddSum(int num){
        int i = 1;
        int Answer = 0;
        while(i<=num){
            if(i % 2 !=0){
                Answer += i;
            }
            i++;
        }
            System.out.println("Sum of Odd Number till "+num+ " is: "+ Answer);
    }
}
