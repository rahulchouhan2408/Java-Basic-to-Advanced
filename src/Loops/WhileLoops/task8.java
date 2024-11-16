// Create a Program to reverse the digits of a number.
package Loops.WhileLoops;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args){
        Scanner reverse = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int check = reverse.nextInt();
        int collect = ReverseDigit(check);
        System.out.print("Reverse of your Digit is: "+collect);
    }
    public static int ReverseDigit(int num){
        int newNum=0;
        while (num>0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;

    }
}
