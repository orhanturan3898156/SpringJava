package Day16_For_Loop;

import java.util.Scanner;

public class Palindorome_Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter words");
        String word = scan.nextLine();

        String reversedWord = "";

        int lastindex = word.length() - 1;


        for (int i = lastindex; i >= 0; i--) {
            reversedWord += word.charAt(i);

        }
        System.out.println(reversedWord);

           /*if (word.equalsIgnoreCase(reversedWord)){
               System.out.println("Pali");
           }else {
               System.out.println("not");
           }*/

        boolean palindrome = word.equalsIgnoreCase(reversedWord);
        System.out.println(palindrome);

    }
}
