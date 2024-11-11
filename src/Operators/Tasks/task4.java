// Create a Program to Calculate Simple Intrest
package Operators.Tasks;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        Scanner interest = new Scanner(System.in);
        System.out.println("Here You Can Calculate Simple Interest");
        System.out.print("Please Enter Your Principle Amount ₹: ");
        int ₹ = interest.nextInt();
        System.out.print("Please enter your Rate of interest: ");
        float rate = interest.nextFloat();
        System.out.print("Tell me for how many years are you borrowing: ");
        float years = interest.nextFloat();
        float simple_interest= (₹*rate*years)/100;
        System.out.println("Your Simple Interest in ₹ is: "+simple_interest);
    }
}
