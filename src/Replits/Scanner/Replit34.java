package Replits.Scanner;

import java.util.Scanner;

public class Replit34 {
    public static void main(String[] args) {
        /*
        Write a program that determines the change to be dispensed from a vending
machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
dollar bill to pay for the item.

- int variable itemPrice
- int variables quarters, dimes, nickels
- Scanner object

Program accepts itemPrice, which is a price for the item you would like to purchase.

Positive behaviour:
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter price in cents:");
        int itemPrice=scan.nextInt();

        int change= 100 - itemPrice;   //70c
        int quarters=change/25; //2
        int dimes=(change -quarters*25)/10;
        int nickel=(change - quarters*25-dimes*10)/5;
        if(itemPrice<25 || itemPrice>100){
            System.out.println("Invalid price!");
        }else if(itemPrice % 5!=0 ){
            System.out.println("Invalid price!");
        }else{
            System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes, "+"and "+nickel+" nickels.");
        }


    }

}
