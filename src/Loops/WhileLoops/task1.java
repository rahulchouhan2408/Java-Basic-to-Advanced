//Create a program that prints the multiplication table for a given number.
package Loops.WhileLoops;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        Scanner multiply = new Scanner(System.in);
        System.out.print("Print enter your number: ");
                int num = multiply.nextInt();
                printMultiplicationTable(num);
            }
        public static void printMultiplicationTable(int table){
        int i = 1;
        while(i<=10){
            System.out.println(table +"X"+i+ "=" +(table*i));
            i++;
        }
                    }
}
