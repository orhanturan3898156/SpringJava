package Day28_Day_and_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date_Time_Formatting {
    public static void main(String[] args) {
        LocalDateTime dateTime1 = LocalDateTime.of(2015, 12, 25, 11, 30, 45);
        System.out.println(dateTime1);

        //Tue 12/25/2015 11:30 am

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a,EEE");
        System.out.println(dateTime1.format(dtf));

        System.out.println("========================================================");
        LocalTime time1 = LocalTime.of(23, 30, 20);
        System.out.println(time1);

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime time2 = LocalTime.of(14, 10);
        System.out.println(time2.format(dtf2));

        System.out.println("========================================================");
        LocalDate date = LocalDate.of(2012, 3, 23);
        System.out.println(date);

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("EEEE dd/MMMM/yy");
        LocalDate date3 = LocalDate.of(1990, 04, 05);
        System.out.println(date3.format(dtf3));

        System.out.println("========================================================");

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy EEEE --- hh:mm:ss a");
        LocalDateTime dateTime4 = LocalDateTime.of(2003, 06, 15, 03, 20, 34);

        System.out.println(dateTime4.format(dtf4));


    }
}
