package Day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {
    public static void main(String[] args) {
        /*
        year :yy,yyyy
        month:MM,MMM
        day  :dd
        days name: EEE(first three letter of the day)
         */

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM/dd/yyyy"); //you can change its order how ever like
                                                          //if you put MMM it will gives you month like Jan, Feb ......


        LocalDate date1=LocalDate.now();
        System.out.println(date1.format(dtf));

        System.out.println("======================================");

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("MMM/dd/yy");
        LocalDate date3=LocalDate.of(2020,04,10);
        String str1=date3.format(dtf2);
        System.out.println(str1);

        LocalDate date2=LocalDate.now();
        System.out.println(date2.format(dtf2));

        System.out.println("======================================");

        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("MMM/dd/yy EEE");
        ///we will say EEE MM/dd/yy /onune yada sonuna yazabilirsin. for full name EEEE (4 E)
        LocalDate date4=LocalDate.now();
        System.out.println(date4.format(dtf3));




    }
}
