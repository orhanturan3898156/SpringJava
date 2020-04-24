package Day28_Day_and_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date_and_Time_Together {
    public static void main(String[] args) {

        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);


        LocalDate date=LocalDate.of(2020,3,20);
        LocalTime time=LocalTime.of(11,25,30);

        LocalDateTime dateTime=LocalDateTime.of(date,time);
        System.out.println(dateTime);

        LocalDateTime dateTime2=LocalDateTime.of(2020,03,20,14,20,30);

        System.out.println(dateTime2);

        DateTimeFormatter date2=DateTimeFormatter.ofPattern("MM/dd/yyyy");




    }
}
