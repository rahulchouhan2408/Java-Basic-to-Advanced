//Create a Program that shows bitwise AND of two numbers.
package Operators.bitwiseOperatorTasks;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        Scanner bitwise = new Scanner(System.in);
        System.out.println("Showcasing bitwise AND Operator");
        System.out.print("Print enter your first number: ");
        int first = bitwise.nextInt();
        System.out.print("Please enter your second number: ");
        int second = bitwise.nextInt();
        int result = first & second;
        System.out.println("Your result is: "+result);
    }
}
