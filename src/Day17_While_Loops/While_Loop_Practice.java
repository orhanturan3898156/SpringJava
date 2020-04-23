package Day17_While_Loops;

import java.util.Scanner;

public class While_Loop_Practice {
    public static void main(String[] args) {
        /*
        as the user to enter yes or no
        if the user enters other than yes or no, repeat the previosus step
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter yes or no");
        String word=scan.next();

        boolean valid=word.equalsIgnoreCase("Yes") || word.equalsIgnoreCase("No");

        while (!valid){
            System.out.println("please re-enter");
            word=scan.next();
            if (word.equalsIgnoreCase("Yes") || word.equalsIgnoreCase("No")){
                break;
            }
        }

        if (word.equalsIgnoreCase("yes")){
            System.out.println("entered yes");
        }if (word.equalsIgnoreCase("no")) {
            System.out.println("entered no");
        }


    }
}
