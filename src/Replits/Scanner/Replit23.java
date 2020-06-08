package Replits.Scanner;

import java.util.Scanner;

public class Replit23 {
    public static void main(String[] args) {
        /*
        Write a program that asks user to input int values: areaCode and localNumber.

        -Using concatenation put together in this format and assign to String phoneNumber  variable:

        -(222)-3334444

        -Write a print statement that displays (use phoneNumber variable ):
        Calling number (222)-3334444
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Area Code");
        int areaCode=scan.nextInt();

        System.out.println("Enter Local Number");
        long localNumber=scan.nextLong();

        System.out.println("("+areaCode+")"+"-"+localNumber);




    }
}
