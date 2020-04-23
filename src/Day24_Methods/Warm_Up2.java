package Day24_Methods;

import java.util.Scanner;

public class Warm_Up2 {
    public static void Calculation(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Invalid operator");

        }
    }


    public static void main(String[] args) {

        int a = 40;
        int b = 8;
        char operator = '+';
        Calculation(5, 4, '*');
        Calculation(a, b, operator);

        while (true) {


            Scanner scan = new Scanner(System.in);

            System.out.println("Enter num1: ");

            int num1 = scan.nextInt();

            System.out.println("Enter num2: ");
            int num2 = scan.nextInt();

            System.out.println("Enter operator: ");

            char operatorr = scan.next().charAt(0);

            Calculation(num1, num2, operator);// result of calculation

            System.out.println("Do you want to continue?");

            String answer = scan.next();


            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {

                System.out.println("Invalid Entry, Please re-enter");

                System.out.println("Do you want to continue?");

                answer = scan.next();

            }


            if (answer.equalsIgnoreCase("No")) {

                break;

            }


        }
    }
}
