package Day33_Custom_Class_Intro;

import java.util.ArrayList;

public class Warm_Up3_Extraction {
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
        char[] arr = str.toCharArray();


        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> specialChars = new ArrayList<>();

        /*for (int i = 0; i <arr.length ; i++) {
            if (Character.isAlphabetic(arr[i])){
                letters.add(arr[i]);
            }
        }
        System.out.println(letters);

         */

        for (char each : arr) {
            if (Character.isAlphabetic(each)) {
                letters.add(each);
            }
            else if (Character.isDigit(each)){
                digits.add(each);
            }else {
                specialChars.add(each);
            }

        }
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialChars);


    }
}
