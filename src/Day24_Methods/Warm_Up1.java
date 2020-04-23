package Day24_Methods;

import java.util.Scanner;

public class Warm_Up1 {

    public static void Max(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("Max is " + num1);
        } else {
            System.out.println("Max is " + num2);
        }

    }

    public static void main(String[] args) {
        int a = 1;
        int b = 10;
        Max(a, b);
    }
}
