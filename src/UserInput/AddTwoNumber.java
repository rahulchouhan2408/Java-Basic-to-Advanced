//This Program asked you your first number and second number then give sum of these numbers
package UserInput;

import java.util.Scanner;

public class AddTwoNumber {
    public static void main(String[] args) {
    Scanner Sum = new Scanner(System.in);
    System.out.print("Please enter your first number: ");
    int num1 = Sum.nextInt();
    System.out.print("Please enter your second number: ");
    int num2 = Sum.nextInt();
    int Add = num1+num2;
        System.out.println(Add);

    }


}
