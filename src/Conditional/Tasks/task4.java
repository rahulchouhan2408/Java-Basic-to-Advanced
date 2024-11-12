// create a program that determine if the given year is leap or not.
package Conditional.Tasks;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        Scanner leap = new Scanner(System.in);
        System.out.print("Please enter your Year: ");
        int year = leap.nextInt();
        if(year % 400 == 0 || (year % 4 ==0 && year % 100 != 0)){
            System.out.println(year + " is a leap year.");
        }else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
