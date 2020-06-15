import java.util.Arrays;
import java.util.Scanner;

public class Self_Study {
    public static void main(String[] args) {
        //day18
        //gift card 035
        //Replit 047,056 back to look
  /*

         Write a program that will print out information about the user based on email.
         Print first and last name from the email with the upper case.
         (Assume that first and last names were separated by an underscore)

         Example:
         Input: craig_federighi@apple.com
         Output:
          name: Craig
         Last name: Federighi
         Domain: apple
         Top-Level Domain: com
         */
        String word="IBRAHIM";

        int lastIndex=word.length()-1;

        String firstLetter=word.substring(0,1).toUpperCase();
        String lastletter=word.substring(lastIndex).toUpperCase();
        word=word.substring(1,lastIndex).toLowerCase();
        String newword=""+firstLetter+word+lastletter;

        System.out.println(newword);


        String str="computer";
        str="water";
        System.out.println(str);







    }
}
