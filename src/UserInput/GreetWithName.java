// This program ask you your Name and then greet you
package UserInput;

import java.util.Scanner;

public class GreetWithName {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String Name = input.nextLine();
        System.out.println("Hello "+Name+ " Welcome to Java Classes ");
    }

}
