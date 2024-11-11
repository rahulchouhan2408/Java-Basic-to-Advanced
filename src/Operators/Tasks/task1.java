//Create a program to calculate product of two floating point numbers.

package Operators.Tasks;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
    Scanner product = new Scanner(System.in);
        System.out.println("Welcome to floating point calculator");
        System.out.print("Please enter your first number: ");
        float num1 = product.nextFloat();
        System.out.print("Please enter your second number: ");
        float num2 = product.nextFloat();
        float Answer = num1*num2;
        System.out.print("Product of your number is: "+Answer);

    }

}
