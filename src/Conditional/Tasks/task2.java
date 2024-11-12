// create a program that determine if a number is Odd or Even.
package Conditional.Tasks;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        float num = number.nextFloat();
        if(num%2==0){
            System.out.println("It is Even Number");
        }else{
            System.out.println("It is Odd Number.");
        }
    }
}
