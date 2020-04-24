package Day15_For_Loop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a word");
        String word=scan.next();

        String reverse="";

        int lastindex=word.length()-1;
        String result="";

        for (int i=lastindex;i>=0;i--){

            result+=word.charAt(i);
        }
        System.out.println(result);

        if (word.equalsIgnoreCase(result)){
            System.out.println("it is a palindrome");
        }else {
            System.out.println("it is not");
        }






    }
}
