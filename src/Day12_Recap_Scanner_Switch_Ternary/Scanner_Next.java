package Day12_Recap_Scanner_Switch_Ternary;
import java.util.Scanner;

public class Scanner_Next {
    //Next doesnt take ENTER when you click

    //Next is used for single word. it brings you a single word.first word
    //NextLine brings you everything
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fullAddress = "";
        System.out.println("Enter the number of the building: ");
        short Bnumber = scan.nextShort();
        fullAddress += Bnumber + " ";

        System.out.println("Enter the Street Name: ");
        String streetName = scan.next();

        fullAddress += streetName + " ";
        System.out.println("Enter the type of the road: ");
        String roadType = scan.next();

        fullAddress += roadType + ", ";

        System.out.println("Enter city name , state, zipcode: ");
        String cityName = scan.next();
        fullAddress += cityName + " ";

        String state = scan.next();
        fullAddress += state + ", ";

        int zipcode = scan.nextInt();
        fullAddress += zipcode;

        System.out.println("Address is:" + fullAddress);


    }
}
