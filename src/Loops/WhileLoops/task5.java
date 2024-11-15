//create a program to find the least common multiple(LCM) of two numbers
package Loops.WhileLoops;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args){
        Scanner LCM = new Scanner(System.in);
        System.out.print("Print enter your first number: ");
        int first = LCM.nextInt();
        System.out.print("Please enter your second number: ");
        int second = LCM.nextInt();
        int answer = LCMfinder(first, second);
        System.out.print("LCM of your numbers is: "+answer);
                    }
        public static int LCMfinder(int num1, int num2){
        int i = 1;
        while (true){
            int factor = num1*i;
            if(factor % num2 ==0){
                return factor;
            }
            i++;
        }
                    }
}
