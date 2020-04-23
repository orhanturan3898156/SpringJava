package Day21_Arrays;

import java.text.DecimalFormat;

public class WarmUp_Practice1_Avarage_Number {
    public static void main(String[] args) {
        /*
        write a program that can return the average from an array of integers
        ex:
         [1,2,3]
         average: 2
         [10, 15, 5, 6]
         average: 9
         [4, 5, 6, 7, 8, 10, 20, 30, 0]
         average: 10
         */
        // DecimalFormat DF=new DecimalFormat("0.00");

        int[] arr = {10, 20, 30, 40, 50};  ///average=total of numbers/length

        int lengthofarr = arr.length;
        //System.out.println(lengthofarr);
        int total = 0;

        for (int i = 0; i < lengthofarr; i++) {
            total += arr[i];

        }
        //System.out.println(total);

        int average = total / lengthofarr;
        System.out.println(average);




    }
}
