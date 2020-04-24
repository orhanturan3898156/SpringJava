package Day13_String_Class_Manupulation;

import java.util.Scanner;

public class String_Manipulation_4_Practice {
    public static void main(String[] args) {

        /*input = cyBerTek sChool
        ouput = CyberTek
                School
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter full name");

        String fullname=scan.nextLine(); // cyBerTek sChool
        String firstname=fullname.substring(0,fullname.indexOf(" "));
        firstname=firstname.substring(0,1).toUpperCase()+firstname.substring(1).toLowerCase();


        String lastname=fullname.substring(fullname.indexOf(" ")+1);
        lastname=lastname.substring(0,1).toUpperCase()+lastname.substring(1).toLowerCase();


        System.out.println("your first name is : "+firstname);
        System.out.println("your last name is : "+lastname);





    }
}
