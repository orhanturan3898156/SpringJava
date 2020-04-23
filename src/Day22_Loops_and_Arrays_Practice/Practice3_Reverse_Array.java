package Day22_Loops_and_Arrays_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice3_Reverse_Array {
    public static void main(String[] args) {

            /*
             1. write a program that can reverse the array
            */


        Scanner scan = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = arr.length - 1; i >= 0; i--) {
            //int eachnum = arr[i];
            System.out.println(arr[i]); // System.out.println(arr[i]);


        }
        System.out.println(Arrays.toString(arr));


        int[] reversed = new int[5];

        int j = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[j];  //5
            j--;
        }
        System.out.println(Arrays.toString(reversed));

    }
}
