package Replits;

import java.util.Scanner;

public class Time_Conversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());


    }

    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */
        if (s.contains("AM")) {
            s = s.replace("AM", "");//07:05:45
            String[] timeArr = s.split(":"); //[07,05,45]
            if (timeArr[0].equals("12")) {
                timeArr[0] = "00";
            }
            s = timeArr[0] + ":" + timeArr[1] + ":" + timeArr[2];
        } else if (s.contains("PM")) {
            s = s.replace("PM", "");
            String[] timeArr = s.split(":");
            if (!timeArr[0].equals("12")) {
                timeArr[0] = Integer.toString(Integer.parseInt(timeArr[0]) + 12);
            }
            s = timeArr[0] + ":" + timeArr[1] + ":" + timeArr[2];
        }
        System.out.println(s);


    }
}
