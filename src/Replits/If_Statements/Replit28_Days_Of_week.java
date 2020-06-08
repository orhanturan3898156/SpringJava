package Replits.If_Statements;

public class Replit28_Days_Of_week {
    /*
    Write an if statement that will print day of the week based on value of the day variable.
     */
    public static void main(String[] args) {

        daysOfWeek(10);

        String result2 = daysOfWeek2(10);
        System.out.println(result2);

        System.out.println(daysOfWeek3(10));


    }

    public static void daysOfWeek(int number) {
        String result = "";
        if (number <= 7 && number >= 1) {
            if (number == 1) {
                result = "Monday";
            } else if (number == 2) {
                result = "Tuesday";
            } else if (number == 3) {
                result = "Wednesday";
            } else if (number == 4) {
                result = "thursday";
            } else if (number == 5) {
                result = "Friday";
            } else if (number == 6) {
                result = "saturday";
            } else {
                result = "Sunday";
            }

        } else {
            result = "Invalid entry";
        }
        System.out.println(result);

    }

    public static String daysOfWeek2(int number) {
        String result = "";
        if (number <= 7 && number >= 1) {
            return result = (number == 1) ? "Mon" :
                    (number == 2) ? "Tue" :
                            (number == 3) ? "Wed" :
                                    (number == 4) ? "Thur" :
                                            (number == 5) ? "Fri" :
                                                    (number == 6) ? "Sat" : "Sunday";
        } else {
            return "Invalid";
        }

    }

    public static String daysOfWeek3(int number) {
        String result = "";

        switch (number) {
            case 1:
                result = "Mon";
                break;
            case 2:
                result = "Tue";
                break;
            case 3:
                result = "Wed";
                break;
            case 4:
                result = "Thu";
                break;
            case 5:
                result = "Fri";
                break;
            case 6:
                result = "Sat";
                break;
            case 7:
                result = "Sun";
                break;
            default:
                result = "Invalid";
        }
        return result;
    }
}
