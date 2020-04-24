package Office_Hours.Practice_03_25_2020;

public class Nested_If_Practice {
    public static void main(String[] args) {
        //we use this method, when have pre-condition
        byte weekdays = 9;
        String result = "";
        if (weekdays >= 1 && weekdays <= 7) {
            if (weekdays == 1) {
                result = "Monday";
            } else if (weekdays == 2) {
                result = "Tuesday";
            } else if (weekdays == 3) {
                result = "Wednesday";
            } else if (weekdays == 4) {
                result = "Thursday";
            } else if (weekdays == 5) {
                result = "Friday";
            } else if (weekdays == 6) {
                result = "Saturday";
            } else {
                result = "Sunday";
            }

        } else {
            result = "Invalid Entry";

        }
        System.out.println(result);
        System.out.println("======================================");
        int salary = 90000;
        int creditScore = 459;
        int workExperience = 5;
        String result2 = "";
        if (salary > 50000) {
            if (creditScore > 700) {
                if (workExperience > 2) {
                    result2 = "Congrate!";

                } else {
                    result2 = "Your work experience not enough!";
                }

            } else {
                result2 = "Your credit score not good enough!";
            }

        } else {
            result2 = "Sorry!Not Eligible!";
        }
        System.out.println(result2);
    }
}
