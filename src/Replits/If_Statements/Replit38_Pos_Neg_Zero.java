package Replits.If_Statements;

public class Replit38_Pos_Neg_Zero {
    /*
    Using Multi-Branch if statements, check if number is positive, negative or zero.
     */
    public static void main(String[] args) {
        int num = 4;
        String result1 = "";
        if (num > 0) {
            result1 = "Positive";
        } else if (num < 0) {
            result1 = "Negative";
        } else {
            result1 = "Zero";
        }
        System.out.println(result1);

        System.out.println("=============================");

        String result2 = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";

        System.out.println(result2);

        System.out.println("=============================");

        numberStatus1(5);  //numberStatus1

        System.out.println("=============================");

        String result3 = numberStatus2(num); //numberStatus2
        System.out.println(result3);


    }

    public static void numberStatus1(int number) {
        String result = "";
        if (number > 0) {
            result = "Positive";
        } else if (number < 0) {
            result = "Negative";
        } else {
            result = "Zero";
        }
        System.out.println(result);

    }

    public static String numberStatus2(int number) {
        String result = "";
        if (number > 0) {
            result = "Positive";
        } else if (number < 0) {
            result = "Negative";
        } else {
            result = "Zero";
        }
        return result;
    }
}
