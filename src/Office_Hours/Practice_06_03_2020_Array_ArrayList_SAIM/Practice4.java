package Office_Hours.Practice_06_03_2020_Array_ArrayList_SAIM;

public class Practice4 {
    public static void main(String[] args) {
        /*
        Create a method that accept a String of multiple words separeted by a space and return the String with which part reversed.
 //The house is big >>>> eht esuoh gib
         */

        String str2 = "Java is fun";
        String[] words = str2.split(" ");
        System.out.println(words[1].length());
/*
        String result=reversedLetters(str2);

        System.out.println(result);


 */


    }

    public static String reversedLetters(String str) {
        //The house is big >>>> eht esuoh gib

        String[] words = str.split(" ");

        String finalWorld = "";

        for (String each : words) {
            String rev = "";
            for (int i = words.length - 1; i >= 0; i--) {
                rev += each.charAt(i);
            }
            finalWorld += rev + " ";
        }
        return finalWorld;

    }


}
