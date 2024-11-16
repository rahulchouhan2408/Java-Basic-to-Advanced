// create a program that print patterns: (i). Right Half Pyramid (ii).Reverse Right Half Pyramid. (iii). Left Half Pyramid
package Loops.WhileLoops;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
    Scanner pyramid = new Scanner(System.in);
        System.out.println("Print enter the number of Rows: ");
        int rows = pyramid.nextInt();
        printFirstPattern(rows);
    }
    public static void printFirstPattern(int maxRows){
        int rows = 0;
        while(rows<maxRows){
            System.out.print("*");
            int i = 0;
            while(i<rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }


}
