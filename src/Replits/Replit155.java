package Replits;

import java.util.Scanner;

public class Replit155 {
    public static void main(String[] args) {

        /*
        In Fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144,……... The first two numbers of Fibonacci series are 0 and 1.

        Given a number num, print n-th Fibonacci Number.
         */

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);


    }

    public static void fib(int num) {

        int[] fib = new int[num + 1];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];


        }
        System.out.println(fib[num]);


    }
}


