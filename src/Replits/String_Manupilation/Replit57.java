package Replits.String_Manupilation;

import java.util.Scanner;

public class Replit57 {
    public static void main(String[] args) {
        /*
        Assume that you have only 2 users: Max Payne and Alan Wake.
        First, ask user to enter full name. Display message: "Enter full name:".
        Then take input from user. If name is equals to either "Max Payne" or "Alan Wake",
         display message: "User found!". Otherwise,  display message: "User not found!".
          Please make your search case insensitive!

         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName = scan.nextLine();

        if (fullName.equals("Max Payne") || fullName.equals("Alan Wake")){
            System.out.println("user found!");
        }else {
            System.out.println("not found");
        }



    }
}
