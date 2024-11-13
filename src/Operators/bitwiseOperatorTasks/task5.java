//craete a program that sshows use of left shift operator.
package Operators.bitwiseOperatorTasks;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args){
        Scanner bitwise = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int num = bitwise.nextInt();
        int result=(num<<1);
        System.out.println("your answer is: "+result);
    }
}
