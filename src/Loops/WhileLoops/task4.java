// create a program that computes the sum of the digits of an integer
package Loops.WhileLoops;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        Scanner SoD = new Scanner(System.in);
        System.out.print("Print enter your digit: ");
        int Add = SoD.nextInt();
        int sum = SumOfDigit(Add);
        System.out.println("Your Sum Of digit is: "+sum);
    }
    public static int SumOfDigit(int num){
        int Answer = 0;
        while(num>0){
            Answer += num%10;
            num /= 10;
        }
        return Answer;
    }

}
