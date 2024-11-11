//Create a program to convert temperature in Fahrenheit into temperature in Celsius
package Operators.Tasks;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args){
        Scanner temperature = new Scanner(System.in);
        System.out.println("Welcome to temperature converter");
        System.out.print("Enter your temperature in fahrenheit: ");
        float fah = temperature.nextFloat();
        float celsius = (fah-32)*5/9;
        System.out.print("Your temperature in celsius is: "+celsius);
    }
}
