package Day15_For_Loop;
import java.util.Scanner;

public class Warmup1_Initials {
    public static void main(String[] args) {
        /*1. write a program that asks user's first and last name, then prints out the initials of the user
           Ex:
           input:
              cybertek
              batch12
              output:your initial is: CB*/

        Scanner scan=new Scanner(System.in);
        System.out.println("First Name");
        String firstname=scan.next();
        System.out.println("Last Name");
        String lastname=scan.next();

        String initials=firstname.toUpperCase().substring(0,1).concat(lastname.toUpperCase().substring(0,1));

        System.out.print(firstname.substring(0,1));
        System.out.print(lastname.substring(0,1));
        System.out.println(firstname.charAt(0));
        System.out.println(lastname.toUpperCase().charAt(0));
        System.out.println(initials);



    }
}
