package Replits.If_Statements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Replit43_MidNumber {
    /*
    Write a program that will return mid number out of three numbers.

     */

    public static void main(String[] args) {

        int num1 = 9;
        int num2 = 3;
        int num3 =-3;
        String result1 = "";
        if (num1 > num2 && num2 > num3) {
            result1 = "n2 is mid number";
        } else if (num2 > num1 && num1 > num3) {
            result1 = "n1 is mid number";
        } else if (num1 > num3 && num3 > num2) {
            result1 = "n3 is mid number";
        }

        System.out.println(result1);

        System.out.println("================================");

        int result2 = midNumber(2, -8, 123);
        System.out.println(result2);

        System.out.println("================================");

       // midNumber2(8,-2,134);



    }

    public static int midNumber(int num1, int num2, int num3) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(num1, num2, num3));
        Collections.sort(list);
        //34,-2,123
        //-2,34,123

        int midnum = list.get(1);

        return midnum;


    }



}
