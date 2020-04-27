package Replits;

public class Replit141 {
    public static void main(String[] args) {
        /*
        Given method called cube.
        Write all required code inside this method in order  to asks the user for a number and then prints the cubed value of that number:

       Example:

       input: 5
       output: 125
         */

        int number = cube(4);
        System.out.println(number);


    }

    public static int cube(int n) {
        int result = 1;

        result = n * n * n;

        return result;




    }
}
