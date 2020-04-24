package Day28_Day_and_Time;

import java.time.LocalDate;

public class Warm_Up1_LocalDAte {
    public static void main(String[] args) {
        /*
         1. create an array of string, store five of your friends names in it
         2. create Array of localdates and store thier birthdays in the same order
         3. use for loop to print out your friends' names and thier birthdays
         */

        String[] friends = {"John", "Aaron", "Daniel"};

        LocalDate JohnBirtday = LocalDate.of(2020, 3, 5);
        LocalDate AaronBirthday = LocalDate.of(2000, 10, 12);
        LocalDate DanielBirthday = LocalDate.of(2010, 5, 6);

        LocalDate[] birthdays = {JohnBirtday, AaronBirthday, DanielBirthday};
        String result = "";
        for (int i = 0; i < friends.length; i++) {
            result = "" + friends[i] + "'s birthday is " + birthdays[i];
            System.out.println(result);
        }


    }
}
