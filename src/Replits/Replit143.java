package Replits;

public class Replit143 {
    public static void main(String[] args) {
        /*
        Create a method printHollowRect that prints a 5 on 5 hollow rectangle:


*****
*   *
*   *
*   *
*****

hint:you will need to use two nested for loops for that,
and an if that checks if its the last or first iteration of the loop (so you will know whet to print "*" or " ")
         */
        printHelloRect();

    }

    public static void printHelloRect() {
        System.out.println("* * * * *");
        for (int i = 0; i < 3; i++) {
            System.out.println("*       *");
        }


        System.out.println("* * * * *");


    }


}
