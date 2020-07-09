package Interview_Prep;

import java.util.*;

public class Q1_Frequency_Of_Chars {
    /*
    Write a return method that can find the frequency of characters

    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static void main(String[] args) {

        frequencyOfChars("AAABBCDD");
        System.out.println();


    }

    public static void frequencyOfChars(String str) {
        //AAABBCDD --->A3B2C1D2

        String nonDup = "";

        for (int i = 0; i < str.length(); i++) {

            if (!nonDup.contains("" + str.charAt(i))) {
                nonDup += str.charAt(i);
            }
        }
        for (int j = 0; j < nonDup.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == nonDup.charAt(j)) {
                    count++;
                }
            }

            System.out.print("" + nonDup.charAt(j) + count);
        }


    }


}
