package Replits.String_Manupilation;

import java.util.Scanner;

public class Replit35_GiftCard {
    public static void main(String[] args) {
        /*
        Let's say I've got a 100$ gift card and you want to buy something in your online store .
         Write a program that will help me to buy something and display leftover balance after purchase.
         If item is not in the list, display message: "Invalid item!".
         If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".

         Item                      Price
         Smartphone                $300
         Laptop                    $400
         Charger                   $15
         USB Cable                 $10
         HeadPhones                $30
         Pants                     $50
         Hat                       $25
         Socks                     $5
         Blanket                   $60
         Pillow                    $40
         */
        Scanner scan = new Scanner(System.in);
        String item = scan.next();

        int initalBalance = 100;
        if (item.equalsIgnoreCase("Smartphone")) {
            System.out.println("Sorry, not enough funds on your gift card!");


        } else if (item.equalsIgnoreCase("laptop")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (item.equalsIgnoreCase("charger")) {
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (initalBalance - 15) + "$");
        } else if (item.equalsIgnoreCase("usb cable")) {
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (initalBalance - 10) + "$");
        } else if (item.equalsIgnoreCase("headphones")) {
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (initalBalance - 30) + "$");
        } else if (item.equalsIgnoreCase("pants")) {
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (initalBalance - 50) + "$");
        } else if (item.equalsIgnoreCase("hat")) {
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (initalBalance - 25) + "$");
        } else if (item.equalsIgnoreCase("socks")) {
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (initalBalance - 5) + "$");
        } else if (item.equalsIgnoreCase("blanket")) {
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (initalBalance - 60) + "$");
        } else if (item.equalsIgnoreCase("pillow")) {
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (initalBalance - 40) + "$");
        } else {
            System.out.println("invalid item!");
        }


    }
}
