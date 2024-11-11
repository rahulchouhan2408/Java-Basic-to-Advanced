// Create a Program to calculate the Area of Triangle
package Operators.Tasks;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args){
        Scanner Area = new Scanner(System.in);
        System.out.println("Here you can calculate Area Of Triangle");
        System.out.print("Please Enter Base Of Triangle: ");
        Double base = Area.nextDouble();
        System.out.print("Please Enter Height Of Triangle: ");
        Double height = Area.nextDouble();
        Double triangle = 0.5*base*height;
        System.out.println("Area Of Triangle: "+triangle);


    }
}
