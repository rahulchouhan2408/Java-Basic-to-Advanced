//Create a Program to calculate Compound Interrest
package Operators.Tasks;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
    Scanner interest = new Scanner(System.in);
        System.out.println("Here you can calculate Compound Interest: ");
        System.out.print("Please enter your principle amount in ₹: ");
        int principle = interest.nextInt();
        System.out.print("Please enter your rate of interest: ");
        float rate = interest.nextFloat();
        System.out.print("Please enter no.of years: ");
        float years = interest.nextFloat();
        double compound_interest =principle*Math.pow((1+rate/100),years);
        System.out.print("Your Compound Interest: "+compound_interest);


    }

}
