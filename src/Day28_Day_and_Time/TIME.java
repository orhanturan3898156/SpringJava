package Day28_Day_and_Time;


import java.time.LocalTime;

public class TIME {
    public static void main(String[] args) {

        //by default it is 24 hour format, we will learn how to format it like date;
        LocalTime time1 = LocalTime.now();
        System.out.println(time1);

        LocalTime time2 = LocalTime.of(15, 30, 45 );
        System.out.println(time2);


        /*
        Time Formatting;

        -hour    :hh
        -minute  :mm
        -second  :ss
        -am/pm   : a >>>just a



         */

    }
}
