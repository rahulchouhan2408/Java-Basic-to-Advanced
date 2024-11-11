//this program swap two numbers

package Operators;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args){
        Scanner Swap = new Scanner(System.in);
        System.out.print("Please enter your First number: ");
        int first = Swap.nextInt();
        System.out.print("Please enter your Second number: ");
        int second = Swap.nextInt();


        int Third = first;
        first=second;
        second = Third;
        System.out.println("Swaping Complete");
        System.out.println("Value of First: "+first);
        System.out.println("Value of Second: "+second);

    }
}
