package Day11_Scanner;


import java.util.Scanner;

public class Scanner_Class {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a long number");
        //int a=9999999999;
        int lnum = (int) scan.nextLong();
        System.out.println(lnum);


    }
}
