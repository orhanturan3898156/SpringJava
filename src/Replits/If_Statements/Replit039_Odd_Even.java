package Replits.If_Statements;

public class Replit039_Odd_Even {
    /*
    Using conditional statements, check if number is odd or even.

     */
    public static void main(String[] args) {

        int num = 23;

        boolean evenNumber = num % 2 == 0;
        String result = "";
        if (evenNumber) {
            result = num + " is an even Number";
        } else {
            result = num + " is an odd number";

        }
        System.out.println(result);

        System.out.println("===================");

        String result2 = (num % 2 == 0) ? "Even number" : "Odd Number";
        System.out.println(result2);
    }

}
