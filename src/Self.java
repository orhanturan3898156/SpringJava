import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Self {
    public static void main(String[] args) {

        /*LocalDate date1=LocalDate.of(2019,02,23);
        System.out.println(date1);

        LocalDate date2=LocalDate.now();
        System.out.println(date2);

        boolean result1=date1.isBefore(date2);
        System.out.println(result1);

        boolean result2=date1.isAfter(date2);
        System.out.println(result2);

        boolean result3=date1.isEqual(date2);
        System.out.println(result3);*/


        /*DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("MM/dd/yyyy EEE");
        LocalDate date1=LocalDate.of(1934,03,29);
        System.out.println(date1.format(dtf1));

        DateTimeFormatter dt2=DateTimeFormatter.ofPattern("EEEE yy_MM_dd");
        LocalDate date2=LocalDate.now();
        System.out.println(date2.format(dt2));*/

        /*LocalTime time1=LocalTime.now();
        System.out.println(time1);

        LocalTime time2=LocalTime.of(14,23,56);
        System.out.println(time2);

        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("hh:mm:ss");
        LocalTime time3=LocalTime.of(12,23,01);
        System.out.println(time3.format(dtf3));

        DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime time4=LocalTime.of(23,37);
        System.out.println(time4.format(dtf4));

         */


        LocalDateTime dateTime1=LocalDateTime.of(2015,03,23,19,57,23);
        System.out.println(dateTime1);

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("MM-dd-yy -- hh:mm:ss a , EEE");
        LocalDateTime time1=LocalDateTime.of(2020,03,19,15,34,20);
        System.out.println(time1.format(dtf1));


    }
}