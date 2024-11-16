// Create a program to print the fibonacci series upto certain number.
package Loops.WhileLoops;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args){
        Scanner fibbonacci = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int check = fibbonacci.nextInt();
        System.out.print("Your fibonacci series upto "+check+" is: ");
        FibonacciSeqNum(check);
    }
    public static void FibonacciSeqNum(int num){
        if(num<0) return;
        System.out.print("0 ");
        if(num == 0) return;
        System.out.print("1 ");
        int first = 0, second = 1;
        while (first + second <= num){
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
}
