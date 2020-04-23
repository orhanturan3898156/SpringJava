package Day18_Nested_Loop_DoWhile;

import java.util.Scanner;

public class Nested_Loop3_Practice {
    public static void main(String[] args) {
        /*
        calculate
         */
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter two numbers");
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();

            System.out.println("Addition of two numbers: " + (num1 + num2));
            System.out.println("Do you want to continue");

            String answer = scan.next();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.out.println("Invalid-re-enter two number-do you want to contnue?");
                answer = scan.next();
            }

            if (answer.equalsIgnoreCase("No")) {
                System.out.println("thank you!");
                break;
            }


        }


    }
}
