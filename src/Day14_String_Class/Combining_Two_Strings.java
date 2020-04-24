package Day14_String_Class;

import java.util.Scanner;

public class Combining_Two_Strings {
    public static void main(String[] args) {
        /*  Ask user to enter two words. Print the first word, second word, second word, first word
            Input:
            one
            two
            Output:
            onetwotwoone
            DO NOT USE + OPERATOR*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two words");
        String word1 = scan.nextLine();
        String word2 = scan.nextLine();

        String combination = word1.concat(" " + word2).concat(" " + word2).concat(word1);




    }
}
