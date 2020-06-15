package Day17_While_Loops;

import java.util.Scanner;

public class Warm_Up_Max_and_Mim {
    public static void main(String[] args) {
        /*
        1. write a program that can ask the user "enter a number" five times and return the maximum number
           hint: you will nedd for loop and if statement
         */
        /*
        . write a program that can ask the user "enter a number" five times and return the minimum number
          hint: you will nedd for loop and if statement
         */
        Scanner scan = new Scanner(System.in);

        int maxnumber = -999999999;


        for (int i = 1; i < 6; i++) {
            System.out.println("enter a number");
            int number = scan.nextInt();

            if (number > maxnumber) {
                maxnumber = number;
            }

        }
        System.out.println("Max number is " + maxnumber);

        System.out.println("==================\n");

        int minnumber = 999999999;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a number");
            int number2 = scan.nextInt();
            if (number2 < minnumber) {
                minnumber = number2;
            }
        }
        System.out.println("min number is " + minnumber);


    }
}
