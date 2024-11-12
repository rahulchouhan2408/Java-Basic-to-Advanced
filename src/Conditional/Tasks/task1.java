//Create a program that determines if a number is positive, negative, or Zero.
package Conditional.Tasks;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        System.out.print("Please Enter Your Number: ");
        Double type = number.nextDouble();
        if(type>0){
            System.out.println("It is a positive number.");
        } else if (type<0) {
            System.out.println("It is a negative number.");
        }else{
            System.out.println("Your number is negative.");
        }
    }
}
