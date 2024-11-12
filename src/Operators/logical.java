package Operators;

import java.util.Scanner;

public class logical {
    public static void main(String[] args){
        Scanner discount = new Scanner(System.in);
        System.out.println("Welcome to ticket discount calculator.");
        System.out.print("Please enter your age: ");
        int age = discount.nextInt();
        System.out.println("Are you Female? (true/false): ");
        boolean isFemale =discount.nextBoolean();
        if(age<5){
            System.out.println("You got 75% discount.");
        } else if (isFemale) {
            System.out.println("you got 50% discount.");
        } else if (age>60 && isFemale) {
            System.out.println("You get 25% discount.");
        }else{
            System.out.println("You don't get any discount.");
        }
    }
}
