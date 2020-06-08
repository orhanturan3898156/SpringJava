package Replits.Scanner;

import java.util.Scanner;

public class Replit21 {
    public static void main(String[] args) {
        /*
        In this assignment you will create a Scanner object and ask user to enter 3 number inputs.

-Declare integer variables num1, num2, num3, sum.

-Create a Scanner object named scan.

-Display prompt "Enter 3 numbers:"

-Using scanner object let user input 3 numbers

-Add 3 numbers and assign to sum variable

-Print "Sum of numbers: ValueOfSum"
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scan.nextInt();
        System.out.println("Enter second number");
        int num2 = scan.nextInt();
        System.out.println("Enter third number");
        int num3 = scan.nextInt();
        int total = num1 + num2 + num3;
        System.out.println("Total is " +total);

    }
}
