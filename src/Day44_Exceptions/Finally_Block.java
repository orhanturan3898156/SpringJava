package Day44_Exceptions;

import java.util.NoSuchElementException;

public class Finally_Block {
    public static void main(String[] args) {
        try {
            System.out.println(9 / 0);
            System.out.println("Try Block");
        } catch (NoSuchElementException e) {
            System.out.println("catch block");
        } finally {
            System.out.println("Finally"); //finally block is ALWAYS executed. not matter exception is handled or not.
            //you need "try" and "catch" to be able to use "finally block"
        }

    }
}
