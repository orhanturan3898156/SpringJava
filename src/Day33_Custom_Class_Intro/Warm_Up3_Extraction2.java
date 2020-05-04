package Day33_Custom_Class_Intro;

import java.util.ArrayList;

public class Warm_Up3_Extraction2 {
    public static void main(String[] args) {
        /*
         write a program that can extract the special characters,
         digits and letters from a string and stores them into seperate ArrayLists of Character:
          ex:
            str = "ABCD123$%#@&456EFG!";
            list1: {$, %, #, @, &, !}
            list2: {A, B, C, D, E, F, G}
            list3: {1, 2, 3, 4, 5, 6}
         */
        //we will solve with string manipulation

        String str = "ABCD123$%#@&456EFG!";


        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> specialChars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (Character.isAlphabetic(each)) {
                letters.add(each);
            } else if (Character.isDigit(each)) {
                digits.add(each);
            } else {
                specialChars.add(each);
            }
        }
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialChars);


    }
}
