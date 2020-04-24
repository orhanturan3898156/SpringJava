package Day12_Recap_Scanner_Switch_Ternary;

import java.util.Scanner;

public class Scanner_NextLine {
    public static void main(String[] args) {
        //It takes everything even ENTER Click
        Scanner scan = new Scanner(System.in);
        System.out.println("Building Number");
        String Bnum = scan.next();
        System.out.println("Building Number is: " + Bnum);

        scan.nextLine(); //if you use NextLine after any step make sure to assign this

        System.out.println("Street: ");
        String street = scan.nextLine();
        System.out.println("Stree is: " + street);
        System.out.println("Enter the zip code: ");
        int zipCode = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the city name and state seperated by comma and space");
        String cityAndstate = scan.nextLine();

        String fulladress = Bnum + " " + street + ", " + cityAndstate + " " + zipCode;
        System.out.println(fulladress);
        scan.close();
    }
}
