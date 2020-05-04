package Day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Unique {
    public static void main(String[] args) {

        /*
        write a program that can return the unique objects from ArrayList of characters
         */

        Character[] chars = {'A', 'A', 'B', 'C', 'D', 'D'};

        ArrayList<Character> charlist = new ArrayList<>(Arrays.asList(chars));
        System.out.println(charlist);

        ArrayList<Character> result = new ArrayList<>();

       /*for (Character each:charlist) {
           int count = Collections.frequency(charlist, each);
           if (count == 1) {
               result.add(each);
           }

       }
        System.out.println(result);

        */

        for (int i = 0; i < charlist.size(); i++) {


            int count = Collections.frequency(charlist, charlist.get(i));
            if (count == 1) {
                result.add(charlist.get(i));
            }
        }
        System.out.println(result);

    }
}
