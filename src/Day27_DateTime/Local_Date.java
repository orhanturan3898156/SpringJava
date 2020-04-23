package Day27_DateTime;

import java.time.LocalDate;

public class Local_Date {
    /*
    Local Date= for creating date (year, months, days)
    methods;
    isAfter();
    isBefore();         >>>all return boolean
    isEqual();
    isLeapYear();

     */
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2020, 04, 23);
        System.out.println(date1);


        LocalDate birthday = LocalDate.of(1990, 04, 05);
        System.out.println(birthday);

        //isAfter(date2)
        boolean result1 = date1.isAfter(birthday);
        System.out.println(result1);

        //isBefore();

        boolean result2 = date1.isBefore(birthday);
        System.out.println(result2);

        //isEqual():
        boolean result3 = date1.isEqual(birthday);
        System.out.println(result3);

        //isLeapyear();
        boolean result4 = birthday.isLeapYear();
        System.out.println(result4);

        System.out.println("===================================================================");


        //current date
        LocalDate now = LocalDate.now();
        System.out.println("Today is " + now);
        String str=now.toString();
        System.out.println(str);
        System.out.println(str.replace("-"," "));

        /*LocalDate birthDay_Rahman = LocalDate.of(1990, 04, 25);
        int month = birthDay_Rahman.getMonthValue();
        int days=birthDay_Rahman.getDayOfMonth();*/





    }


}
