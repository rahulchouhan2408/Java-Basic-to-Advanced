// create a program to check if a number is an armstrong number
package Loops.WhileLoops;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args){
        Scanner armstrong = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int number = armstrong.nextInt();
        boolean isArmStrong = isArmStrong(number);
        if(isArmStrong){
            System.out.println("Your number is ArmStrong.");
        }else {
            System.out.println("Your number is not ArmStrong");
        }
    }
    public static boolean isArmStrong(int num){
        int noOfDigits = noOfDigits(num);
        int numCopy = num;
        int finalNumber = 0;
        while (num>0){
            int lastDigit = num % 10;
            num /= 10;
            finalNumber += Pow(lastDigit, noOfDigits);
        }
        return finalNumber == numCopy;
    }
    public static int Pow(int num1, int num2){
        int result = 1;
        int i = 0;
        while(i<num2){
            result *= num1;
            i++;
        }
        return result;
    }
    public static int noOfDigits(int num){
        int digits = 0;
        while(num>0){
            digits++;
            num /= 10;
        }
        return digits;
    }
}
