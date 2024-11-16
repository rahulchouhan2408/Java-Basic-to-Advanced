// Create a Program to check whether a given number is Prime.
package Loops.WhileLoops;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args){
        Scanner prime = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int check = prime.nextInt();
        boolean isPrime = PrimeChecker(check);
        if(isPrime){
            System.out.print("Your number is Prime.");
        }else{
            System.out.print("Your number is not prime.");
        }

    }
    public static boolean PrimeChecker(int num) {
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

}
