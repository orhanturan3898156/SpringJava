package Day17_While_Loops;

import java.util.Scanner;

public class Warm_up_3 {
    public static void main(String[] args) {
        /* enter the math operators
(assume that only the +, -, *, /, and % will be entered)
then the system will give the result based on the operator
at the end it will ask if the user want's to calculate another numbers, if user
entered "NO" or "no", the program will stop execution, otherwise it repeats all the previous steps
(you will need a lop that has true condition without the iterator)

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number");
        int number1 = scan.nextInt();
        System.out.println("enter second number");
        int number2 = scan.nextInt();

        System.out.println("math operator: ");

        String operator = scan.next(); //+ - * / % //String operator=scan.next();

        for (int i = 0; i == 0; ) {
            if (operator.equals("+")) {
                System.out.println("Addition is :" + (number1 + number2));

            } else if (operator.equals("-")) {
                System.out.println("Subtraction is: " + (number1 - number2));
            } else if (operator.equals("*")) {
                System.out.println("Multipcation is: " + (number1 * number2));
            } else if (operator.equals("/")) {
                System.out.println("division is: " + (number1 / number2));
            } else if (operator.equals("%")) {
                System.out.println("remainder is: " + (number1 % number2));

            } else {
                System.out.println("Invalid");
            }
            System.out.println("Do you want to continue");
            String answer = scan.next();
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you fo using the calculator");
                break;
            }
        }


    }
}
