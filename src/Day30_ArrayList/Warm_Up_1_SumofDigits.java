package Day30_ArrayList;

import java.util.Arrays;

public class Warm_Up_1_SumofDigits {
    /*
    1. write a program that can return the sum of all the digits from a string
       ex:
       input: "a1b2c3"
       output: 6
       (1+2+3= 6)
       input: "Today's date is 04/27/2020"
       output: 17
       (0+4+2+7+2+0+2+0=17)
       HINT: on ascii table, the characters between #48 ~ #57 are digits
     */
    public static void main(String[] args) {

        String str = "a1b2c3d4";

        char[] arr = str.toCharArray();
        //System.out.println(Arrays.toString(ch)); // returns [a, 1, b, 2, c, 3]
        int sum = 0;
        for (char each : arr) {
            /*boolean isDigit = each >= 48 && each <= 57;
            if (isDigit) {
                sum += Integer.parseInt("" + each);            >>>>>>>>>>>>first solution


            }*/

            if (Character.isDigit(each)){
                sum+=Integer.parseInt(""+each);
            }

        }
        System.out.println(sum);


      //  boolean a=Character.isAlphabetic('A');///identify if the character is alphafet





    }
}
