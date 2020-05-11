package Day35_Static;

import java.util.Scanner;

public class Static_Practice {

    //when to use static variable

    static Scanner scan = new Scanner(System.in); //if it is common for all and only one. you can use it.

    public static void main(String[] args) {

        //Scanner scan = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = scan.nextInt();

        System.out.println("Enter num2");
        int num2 = scan.nextInt();

        System.out.println("sum is : " + (num1 + num2));



    }

    public void methhod1() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = scan.nextInt();

        System.out.println("Enter num2");
        int num2 = scan.nextInt();

        System.out.println("Multiplication is: " + (num1 * num2));


    }
}
