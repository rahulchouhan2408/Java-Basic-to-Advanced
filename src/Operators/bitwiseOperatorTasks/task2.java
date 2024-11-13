//create a program that shows bitwise OR Operator of two numbers.
package Operators.bitwiseOperatorTasks;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        Scanner bitwise =new Scanner(System.in);
        System.out.print("Please enter your first number: ");
        int first = bitwise.nextInt();
        System.out.print("Please enter your second number:");
        int second = bitwise.nextInt();
        int result = first|second;
        System.out.println("Your result is: "+result);
    }
}
