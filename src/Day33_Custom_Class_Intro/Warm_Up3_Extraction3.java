package Day33_Custom_Class_Intro;

import java.util.ArrayList;
import java.util.Arrays;

public class Warm_Up3_Extraction3 {
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

        String str = "ABCD123$%#@&456EFG!";

        char[] ch = str.toCharArray();

        Character[] arr = new Character[ch.length];
        for (int i = 0; i < ch.length; i++) {
            arr[i] = ch[i];
        }


        ArrayList<Character> letters = new ArrayList<>(Arrays.asList(arr));
        letters.removeIf(p -> !Character.isLetter(p));
        System.out.println(letters);


        ArrayList<Character> digits = new ArrayList<>(Arrays.asList(arr));
        digits.removeIf(p -> !Character.isDigit(p));
        System.out.println(digits);


        ArrayList<Character> specialChars = new ArrayList<>(Arrays.asList(arr));
        specialChars.removeIf(p -> Character.isDigit(p) || Character.isLetter(p));
        System.out.println(specialChars);


    }
}
