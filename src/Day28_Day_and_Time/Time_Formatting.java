package Day28_Day_and_Time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time_Formatting {
    public static void main(String[] args) {

        /*
        Time Formatting;

        -hour    :hh
        -minute  :mm
        -second  :ss
        -am/pm   : a >>>just a



         */


        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime time1=LocalTime.of(16,30);
        System.out.println(time1.format(dtf));

        LocalTime time2=LocalTime.of(12,0);
        System.out.println(time2.format(dtf));

        boolean result1=time1.isAfter(time2);
        System.out.println(result1);


    }
}
