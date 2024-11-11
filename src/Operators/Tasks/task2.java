//Create a Program to Calculate Perimeter Of Rectangle
package Operators.Tasks;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        System.out.println("Here You Can Find Perimeter Of Rectangle");
        Scanner perimeter = new Scanner(System.in);
        System.out.print("Please Enter First Side Of Your Rectangle: ");
        double first = perimeter.nextDouble();
        System.out.print("Please Enter Second Side Of Your Rectangle: ");
        double second = perimeter.nextDouble();
        System.out.print("Please Enter Third Side Of Your Rectangle: ");
        double third = perimeter.nextDouble();
        System.out.print("Please Enter Fourth Side Of Your Rectangle: ");
        double fourth = perimeter.nextDouble();
        Double Answer = first+second+third+fourth;
        System.out.println("Perimeter Of Your Rectangle is: "+Answer);
    }
}
