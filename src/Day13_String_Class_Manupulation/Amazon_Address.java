package Day13_String_Class_Manupulation;

import java.util.Scanner;

public class Amazon_Address {
    public static void main(String[] args) {
        /*
        Street address (Assume it has more than one word)
        city name
        state name
        zip code
        full name of the person:
        and prints the ship to info in the following format:
        ex output:
        Ship To:  Jimmy joe
        7925 Jones Branch Dr
        MCLean, VA 22102*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Building Number");
        String buildingNumber=scan.next();

        scan.nextLine();

        System.out.println("Enter Street Address");
        String street=scan.nextLine();

        System.out.println("Enter City");
        String city=scan.nextLine();

        System.out.println("Enter State");
        String state=scan.nextLine();

        System.out.println("Zipcode");
        int zipcode=scan.nextInt();

        scan.nextLine();

        System.out.println("Full Name");
        String fullname=scan.nextLine();

        String result="Ship to: "+fullname+"\n\t"+buildingNumber+ " "+ street+"\n\t"+city+", "+state+" "+ zipcode;
        System.out.println(result);


    }
}
