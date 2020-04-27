package Replits;

import java.util.Scanner;

public class Replit139 {
    public static void main(String[] args) {


        /*
        create a static method called "plus", its return is void and it gets no arguments.

        It asks the user to input two numbers, then it will add them and print the result.
        Create a scanner within plus method.

        Example:

        enter first number:
         1
        enter second number:
          2
        result: 3
         */
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        plus(num1, num2);


    }

    public static void plus(int num1, int num2) {

        System.out.println(num1 + num2);


    }

}
