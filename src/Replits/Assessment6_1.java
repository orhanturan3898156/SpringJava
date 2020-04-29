package Replits;

import java.util.Arrays;
import java.util.Scanner;

public class Assessment6_1 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        s = s.toLowerCase();

        //orhan oRhAn
        String[] arr = s.split(""); //[
        //System.out.println(Arrays.toString(arr));

        String result = "";

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                result += arr[i].toLowerCase();
            }
            if (!(i % 2 == 0)) {
                result += arr[i].toUpperCase();
            }


        }
        System.out.println(result);


    }
}
