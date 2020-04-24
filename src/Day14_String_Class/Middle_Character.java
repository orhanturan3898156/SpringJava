package Day14_String_Class;

import java.util.Scanner;

public class Middle_Character {
    public static void main(String[] args) {
        /*Write a Java method to display the middle character of a string
             a) If the length of the string is even there will be two middle characters.
             b) If the length of the string is odd there will be one middle character.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word1 = scan.nextLine();
        String middlecharacter = "";

        int totalchars = word1.length();
        int middlenumber = totalchars / 2; // ertyuio

        if (totalchars % 2 != 0) {
            middlecharacter += word1.charAt(middlenumber);
            // middlecharacter=middlecharacter +word1.charAt(middlenumber);


        }else {
            middlecharacter=middlecharacter +word1.charAt(middlenumber-1)+word1.charAt(middlenumber);


        }

        System.out.println(middlecharacter);


    }
}
