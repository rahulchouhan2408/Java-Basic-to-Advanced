// This program asked you to enter your Name and Age.
package UserInput;

import java.util.Scanner;

public class Name_Age {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String Name = input.nextLine();
        System.out.println("Hello "+Name);
        System.out.print(Name + " also tell your age: ");
        int age = input.nextInt();
        System.out.println("Your age is: "+age);

    }
}
