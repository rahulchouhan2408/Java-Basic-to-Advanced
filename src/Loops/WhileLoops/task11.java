// create a program to verify if a number is palindrome
package Loops.WhileLoops;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args){
        Scanner palindrome = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int number = palindrome.nextInt();
        boolean isPalindrome = isPalindrome(number);
        if(isPalindrome){
            System.out.print("Your number is palindrome.");
        }else{
            System.out.print("Your number is not palindrome");
        }

    }
    public static boolean isPalindrome(int num){
        return num == digitReverse(num);
    }
    public static int digitReverse(int number){
        int newNum = 0;
        while(number>0){
            int digit = number%10;
            newNum = newNum*10+digit;
            number /=10;
        }
        return newNum;
    }
}
