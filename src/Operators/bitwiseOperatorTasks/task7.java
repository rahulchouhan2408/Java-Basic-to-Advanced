// craete a program to check if a given number is even or Odd using bitwise operator.
package Operators.bitwiseOperatorTasks;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args){
        Scanner bitwise = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int num = bitwise.nextInt();
        if((num&1)==1){
            System.out.println("Your number is Odd.");
        }else{
            System.out.println("Your number is Even.");
        }
    }
}
