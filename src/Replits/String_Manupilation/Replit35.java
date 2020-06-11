package Replits.String_Manupilation;

import java.util.Scanner;

public class Replit35 {
    public static void main(String[] args) {
        /*
        in this assignment you are given two string variables word1 and word2.
you need to check if they are equal using an if.

Comparison should be case sensitive. "java" and "JaVa" are not equal.

if they are equal output  "word1 equals word2"
else output "word1 does not equal word2"
         */
        Scanner scan=new Scanner(System.in);
        String word1=scan.next();
        String word2=scan.next();

        if (word1.equals(word2)){
            System.out.println("They are equal");
        }else {
            System.out.println("not equal");
        }
    }
}
