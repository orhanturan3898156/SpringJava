package Day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Summary {
    public static void main(String[] args) {

        /*LocalDate date1=LocalDate.of(2020,04,01);
        System.out.println(date1);

        LocalDate date2=LocalDate.of(1990,04,05);
        System.out.println(date2);

        boolean result1=date1.isAfter(date2);
        System.out.println(result1);

        boolean result2=date2.isBefore(date1);
        System.out.println(result2);

        boolean result3=date1.isEqual(date2);
        System.out.println(result3);

        boolean result4=date1.isLeapYear() || date2.isLeapYear();
        System.out.println(result4);


        LocalDate now=LocalDate.now();
        System.out.println(now);
        String date5=now.toString();
        System.out.println(date5.replace("-","."));

        System.out.println("\n================================\n");*/

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM-dd-yyyy EEE");

        LocalDate date1=LocalDate.of(2010,01,4);
        System.out.println(date1.format(dtf));

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("EEE yyyy/MM/dd");
        LocalDate date2=LocalDate.of(1990,04,05);
        System.out.println(date2.format(dtf2));


        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("dd_MM_yyyy");

        LocalDate date3=LocalDate.of(2019,02,12);
        System.out.println(date3.format(dtf3));


    }
}
