// create a program to to find the Greatest Common Divisor(GCD) of two integers.
package Loops.WhileLoops;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args){
        Scanner gcd = new Scanner(System.in);
        System.out.print("Please enter your first number: ");
        int first = gcd.nextInt();
        System.out.print("Please enter your second number: ");
        int second = gcd.nextInt();
        int answer = GreatestCommonNumber(first, second);
        System.out.println("GCD of your numbers is: "+answer);
            }
        public static int GreatestCommonNumber(int num1, int num2){
        int gcd=1; int i=2;
        while (i<num1){
            if(num1 % i == 0 && num2 % i ==0){
                gcd = i;
            }
            i++;
        }
        return gcd;
        }
        public static int least(int num1, int num2){
        if(num1<num2){
            return num1;
        }else {
            return num2;
        }
        }
}
