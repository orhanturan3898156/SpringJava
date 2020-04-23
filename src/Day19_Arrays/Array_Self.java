package Day19_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Self {
    public static void main(String[] args) {

        String str1 = "Cybertek School";
        String str2 = "School Cybertek";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.equals(ch1, ch2));


    }
}
