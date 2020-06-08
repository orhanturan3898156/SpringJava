package Day9_Nested_If_And_Ternary;


public class Ternary_Practice2 {
    public static void main(String[] args) {
        int num1 = 300;
        int num2 = 200;
        int min = (num1 < num2) ? num1 : num2;
        System.out.println(min);
        System.out.println("\n=====================================");

        int hour = 156;
        if (hour <= 24 && hour > 0) {
            String result = (hour < 12) ? "Good Morning" : (hour > 12 && hour < 18) ? "Good Afternoon" : "Good Night";
            System.out.println(result);
        } else {
            System.out.println("Invalid");
        }

        System.out.println("\n=====================================");

        int number = 105;
        boolean divi = (number % 5 == 0 && number % 3 == 0) ? true : false;
        System.out.println(divi);
        System.out.println("\n=====================================");


    }
}
