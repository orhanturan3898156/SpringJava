package Day28_Day_and_Time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_Time_Formatting {
    public static void main(String[] args) {
        LocalDateTime dateTime1=LocalDateTime.of(2015,12,25,11,30,45);
        System.out.println(dateTime1);

        //Tue 12/25/2015 11:30 am

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a,EEE");
        System.out.println(dateTime1.format(dtf));


    }
}
