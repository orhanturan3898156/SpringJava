package Office_Hours.Practice_04_08_2020;

import java.util.Scanner;

public class While_Loop_Max_Min_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maxnumber = -999999999;

        int i = 1;

        while (i <= 3) {

            System.out.println("enter a number");
            int num1 = scan.nextInt();
            if (num1 > maxnumber) {
                maxnumber = num1;
            }

            i++;


        }
        System.out.println("max is "+maxnumber);


        System.out.println("\n===========================\n");

        int min=999999999;

        int j = 1;

        while (j <= 3) {

            System.out.println("enter a number");
            int num1 = scan.nextInt();
            if (num1 < min) {
                min = num1;
            }

            j++;


        }
        System.out.println("min is "+min);



    }
}