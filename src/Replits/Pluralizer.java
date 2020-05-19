package Replits;

import java.util.Scanner;

public class Pluralizer {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("# in:");
        int amt = inp.nextInt();
        inp.nextLine(); //this line is necessary
        System.out.print("word:");
        String word = inp.nextLine();
//leave the above unedited, write your code below:
        String s= "";
        if (word.endsWith("ay") || word.endsWith("oy") || word.endsWith("ey") || word.endsWith("uy")) {
            word = word + "s";
        } else if (word.endsWith("y")) {
            word = word.replace("y", "ies");
        } else if (word.endsWith("sh") || word.endsWith("ch")) {
            word = word + "es";

        } else if (word.endsWith("us")) {
            word = word.replace("us", "i");

        } else if (word.endsWith("fe")) {
            word = word.replace("fe", "ves");
        } else {
            word = word + "s";
        }

        if (amt == 1) {
            word = amt + " " + word;
        }
        System.out.println(word);


    }
}
