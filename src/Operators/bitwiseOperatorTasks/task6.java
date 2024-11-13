//create a program that shows use of right shift operator.
package Operators.bitwiseOperatorTasks;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args){
        Scanner bitwise = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int num = bitwise.nextInt();
        int result = num>>1;
        System.out.println("Your result is: "+result);
    }
}
