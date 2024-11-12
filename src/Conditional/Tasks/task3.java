// create a program that determines the greatest of the three numbers.
package Conditional.Tasks;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args){
        Scanner greatest = new Scanner(System.in);
        System.out.print("Please enter your first number: ");
        int first = greatest.nextInt();
        System.out.print("Please enter your second number: ");
        int second = greatest.nextInt();
        System.out.print("Please enter your third number: ");
        int third = greatest.nextInt();
        if(first>=second && first>=third){
            System.out.println(first + " is a greatest number.");
        } else if (second>=third) {
            System.out.print(second + " is a greatest number.");
        }else{
            System.out.print(third + " is a greatest number.");
        }
    }
}
