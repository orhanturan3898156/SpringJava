package Replits.If_Statements;

public class BiggestNumber {
    /*
    in this problem you need to write a program that checks for the bigger of 3 numbers.

you get 3 int variables: n1 , n2 and n3

if n1 is biggest output: "n1 is bigger"
if n2 is biggest output: "n2 is bigger"
if n3 is biggest output: "n3 is bigger"
     */
    public static void main(String[] args) {

        int num1 = 4;
        int num2 = 5;
        int num3 = 6;

        String result = (num1 > num2 && num1 > num3) ? "n1 is the biggest"
                : (num2 > num1 && num2 > num3) ? "n2 is the biggest"
                : "num3 is the biggest";

        System.out.println(result);

    }

}
