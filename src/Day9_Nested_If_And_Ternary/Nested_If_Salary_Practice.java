package Day9_Nested_If_And_Ternary;

public class Nested_If_Salary_Practice {
    public static void main(String[] args) {
        double salary = 200000;
        byte workexperience = 5;

        if (salary >= 30000) {
            if (workexperience >= 2) {
                System.out.println("You are eligible");
            } else if (workexperience < 2) {
                System.out.println("Need more work experience");
            }

        } else {
            System.out.println("Sorry!!!Your are not eligible for loan!");
        }



        double salary2 = 48000;
        byte workexperience2 = 7;
        String result = " ";
        if (salary2 >= 30000) {
            result = (workexperience2 >= 2) ? "Congrate" : "Sorry!!!";

        } else {
            result = "Not Eligible";

        }
        System.out.println(result);


    }
}
