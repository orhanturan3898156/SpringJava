package Day14_String_Class;

import java.util.Scanner;

public class Combine_to_String_to {
    public static void main(String[] args) {
        /*Ask user to enter two words. Print first word without its first character then print the second word without its first character.
          Input:
          apple
          banana
          Output:
          ppleanana*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two words");
        String word1 = scan.nextLine();
        word1 = word1.substring(1);  //word1=word1.substring(1,word1.lenght())
        String word2 = scan.nextLine();
        word2 = word2.substring(1, word2.length());

        String combintion = word1.concat(word2);
        System.out.println(combintion);


    }
}
