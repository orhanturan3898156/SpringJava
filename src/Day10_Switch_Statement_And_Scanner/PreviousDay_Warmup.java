package Day10_Switch_Statement_And_Scanner;
public class PreviousDay_Warmup {
    public static void main(String[] args) {
        byte day = 10;
        String result = " ";
        String result2 = " ";
        if (day >= 1 && day <= 7) {
            result = (day == 1) ? "Monday" : (day == 2) ? "Tuesday" : (day == 3) ? "Wednesday" : (day == 4) ? "Thursday" : (day == 5) ? "Friday" : (day == 6) ? "Saturday" : "Sunday";

        } else {
            result = "Not Valid Entry";
        }
        System.out.println(result);

        if (day >= 1 && day <= 7) {
            if (day == 1) {
                result2 = "Monday";
            } else if (day == 2) {
                result2 = "Tuesday";
            } else if (day == 3) {
                result2 = "Wednesday";
            } else if (day == 4) {
                result2 = "Thursday";
            } else if (day == 5) {
                result2 = "Friday";
            } else if (day == 6) {
                result2 = "Saturday";
            } else {
                result2 = "Sunday";
            }


        } else {
            result2 = "Invalid";
            System.out.println(result2);
        }
        System.out.println("\n============================================================================");
    }
}
