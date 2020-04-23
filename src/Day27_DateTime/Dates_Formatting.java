package Day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {
    public static void main(String[] args) {
        /*
        year :yy,yyyy
        month:MM,MMM
        day  :dd
         */

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM/dd/yyyy"); //you can change its order how ever like
                                                          //if you put MMM it will gives you month like Jan, Feb ......


        LocalDate date1=LocalDate.now();
        System.out.println(date1.format(dtf));




    }
}
