package Replits;

import java.util.Scanner;

public class conditional_statement {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();

        if (word.endsWith("ey")) {
            System.out.println("-eys");
        } else if (word.endsWith("y")) {
            System.out.println("-ies");
        } else if (word.endsWith("ife")) {
            System.out.println("-ives");
        } else {
            System.out.println("-s");
        }


    }
}
