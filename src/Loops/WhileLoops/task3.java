//write a function that calculates the factorial of a given number
package Loops.WhileLoops;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args){
        Scanner factorial = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int num = factorial.nextInt();
        long fact = factNum(num);
        System.out.println("Factorial of your number is: "+fact);
    }
    public static long factNum(int first){
        if(first<2){
            return 1;
        }
        long Answer = 1;
        int i = 2;
        while (i<=first){
            Answer *=i;
            i++;
        }
        return Answer;
    }

}
