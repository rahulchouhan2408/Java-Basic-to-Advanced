// create a program that calculate grades based on marks.
package Conditional.Tasks;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args){
        Scanner grades = new Scanner(System.in);
        System.out.println("Please enter your marks: ");
        int marks = grades.nextInt();
        if(marks>=90){
            System.out.println("Your grade is: A");
        } else if (marks<90 && marks>=75 ) {
            System.out.println("Your grade is: B");
        } else if (marks<75 && marks >=60) {
            System.out.println("Your grade is: C");
        } else if (marks<60 && marks>=30) {
            System.out.println("Your grade is: D");
        }else {
            System.out.println("Your grade is: F");
        }

    }
}
