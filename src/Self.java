import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Self {

    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";

        char[] arr = str.toCharArray();

        Character[] arr2 = new Character[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }


       // ArrayList<Character> list = new ArrayList<>(Arrays.asList(arr2));


        ArrayList<Character> letters = new ArrayList<>(Arrays.asList(arr2));
        letters.removeIf(p-> !Character.isAlphabetic(p));
        System.out.println(letters);

        ArrayList<Character> numbers = new ArrayList<>(Arrays.asList(arr2));
        numbers.removeIf(p-> !Character.isDigit(p));
        System.out.println(numbers);



        ArrayList<Character> specialChars = new ArrayList<>(Arrays.asList(arr2));
        specialChars.removeIf(p-> Character.isDigit(p) || Character.isAlphabetic(p));
        System.out.println(specialChars);


        /*for (int i = 0; i <arr.length ; i++) {
            if (Character.isDigit(arr[i])){
                numbers.add(arr[i]);
            }
            else if (Character.isAlphabetic(arr[i])){
                letters.add(arr[i]);
            }
            else {
                specialChars.add(arr[i]);
            }
        }


        System.out.println(letters);
        System.out.println(numbers);
        System.out.println(specialChars);

         */

       /* for(char each:arr ){
            if (Character.isDigit(each)){
                numbers.add(each);
            }
            else if (Character.isAlphabetic(each)){
                letters.add(each);
            }
            else {
                specialChars.add(each);
            }
        }

        */




    }
}
