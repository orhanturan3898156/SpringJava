package Replits.Scanner;

import java.util.Scanner;

public class Replit32 {
    /*
    Write a program that outputs the number of hours, minutes, and seconds that
    corresponds to input total seconds.

    -create a Scanner object
    - declare int variables inputSeconds, hours, minutes, seconds
    -Ask user enter seconds by printing:
     "Enter seconds:"

       -Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
       -Assign values to the hours, minutes, seconds variables
       -Display the result.

      Example run:
      Enter seconds:
      3695
      1 hours, 1 minutes, and 35 seconds
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter seconds");
        int seconds = scan.nextInt();//3695

        int hours = seconds / 3600;
        int minute = (seconds % 3600) / 60;
        int second = (seconds % 3600) % 60;
        System.out.println(hours + " " + minute + " " + second);


    }
}
