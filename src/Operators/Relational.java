package Operators;

import java.util.Scanner;

public class Relational {
    public static void main(String[] args){
        Scanner licence = new Scanner(System.in);
        System.out.println("Welcome to driving School");
        System.out.print("Please enter your age: ");
        int age = licence.nextInt();
        if(age>=18){
            System.out.println("You are eligible for licence.");
        }else{
            System.out.println("You are not eligible for licence.");
        }
    }
}
