package Day7_If_Statement_Else;

public class Max_Number {
    public static void main(String[] args) {

        double a = 60.3;
        double b = 40;
        double c = 500.1;

        boolean aBiggest = a > b && a > c;
        boolean bBiggest = b > a && b > c;
        boolean cBiggest = c > a && c > b;


        String result = "";
        if (aBiggest) {
            result = "A is Biggest";
        } else if (bBiggest) {
            result = "B is Biggest";

        } else {
            result = "C is biggest";
        }
        System.out.println(result);

        System.out.println("=================================");

        /*
         (condition1)? "result1":(condition2)? "result2":"rsult3";
         */

        String result2=(a > b && a > c)? "A is Biggest":(b > a && b > c)? "B is Biggest":"C is biggest";

        System.out.println(result2);


    }
}
