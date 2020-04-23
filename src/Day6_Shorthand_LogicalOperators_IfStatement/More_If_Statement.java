package Day6_Shorthand_LogicalOperators_IfStatement;

public class More_If_Statement {
    public static void main(String[] args) {

        int a = 13;
        int b = 18;

        if (a > b) {
            System.out.println("It is night");
        }
        if (b > a) {
            System.out.println("It is day");
        }
        System.out.println("==========================================");
        int a1 = 1230;
        boolean tamNumber = a1 % 5 == 0;


        if (tamNumber) {

            System.out.println("It is tamNumber");
        }
        System.out.println("=========================================");

        boolean sick = true;
        if (sick) {
            System.out.println("do not go to school");

        }
        System.out.println("==========================================");

        int e = 3456;
        if (e > 100) {

            System.out.println(e + " is a big number");

        }
        if (e < 99 && e > 50) {
            System.out.println(e + " is a middle number");
        }
        if (e < 49) {

            System.out.println(e + " is a small number");
        }

        System.out.println("===========================================");
        int alex = 32;
        int john = 35;
        boolean result = john > alex;
        if (result) {
            System.out.println(true);

        }
        System.out.println("===========================================");

        int jack = 34;
        int smith = 25;

        if (jack > smith) {
            System.out.println("Jack is older than Smith");
        }
        if (smith > jack) {
            System.out.println("Smith is older than Jack");
        }
        System.out.println("======================================");

        double schoolpoint = 500.23;
        if (schoolpoint > 850) {

            System.out.println("The School is great");
        }
        if (schoolpoint < 850 && schoolpoint > 650) {

            System.out.println("The School is good");
        }
        if (schoolpoint < 649) {
            System.out.println("The School is bad");
        }
        System.out.println("=====================================");

        double creditscore = 876;
        if (creditscore > 500 && creditscore < 699) {
            System.out.println("Your Credit Score is: " + creditscore + " - Fair");
        }
        if (creditscore > 700 && creditscore < 799) {
            System.out.println("Your Credit Score is: " + creditscore + " - Good");

        }
        if (creditscore > 800) {
            System.out.println("Your Credit Score is: " + creditscore + " - Excellent");
        }

        boolean feelsick = !true;
        if (feelsick) {
            System.out.println("stay at home");
        }


    }

}
