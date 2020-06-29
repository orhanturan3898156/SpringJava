package Day21_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class String_Methods {
    public static void main(String[] args) {


        // toCharArray()=returns char of array

        String name = "Java";

        char[] chars = name.toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars[3]);
        //System.out.println(chars[4]);

        System.out.println("========================");

        /*Split Method:
        split(Value): splits the string with given value
         */

        String str = "I like Java";
       // char[] arr5=str.toCharArray();
        //System.out.println(Arrays.toString(arr5));

        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

        /*

         */

        String sentence = "Today is great day";

        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        String reveresed = "";

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");

        }
        System.out.println("========================");

        String str2="ABCD";

        String[] arr2=str2.split("");
        char[] ch2=str2.toCharArray();


        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(ch2));




    }
}
