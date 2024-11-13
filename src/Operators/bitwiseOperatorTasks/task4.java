//create a program that shows bitwise Compliment of a number.
package Operators.bitwiseOperatorTasks;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        Scanner bitwise = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int first = bitwise.nextInt();
        int result = ~first;
        System.out.println("Your result is: "+result);
    }
}
