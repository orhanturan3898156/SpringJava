package Day14_String_Class;


import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        /*
        Ask user to enter a word. Print true is the first and last characters of the string are same characters,
        print false otherwise.
        Input:
             abba
             Output:
             true
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word");

        String word=scan.next();

        char firstletter=word.charAt(0);
        System.out.println(firstletter);
        char lastletter=word.charAt(word.length()-1);
        if (firstletter==lastletter){
            System.out.println("same");
        }else {
            System.out.println("not same");
        }


    }
}
