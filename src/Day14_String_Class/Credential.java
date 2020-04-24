package Day14_String_Class;

import java.util.Scanner;

public class Credential {
    public static void main(String[] args) {
        /*
        username:cyberTek
        password:cybertekschool
         */
        String validusername = "cybertek";
        String validpassword = "cybertekschool";

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter username");
        String username = scan.next();


        System.out.println("Enter password");
        String password = scan.next();


        if (username.equals(validusername) && password.equals(validpassword)) {
            System.out.println("Log in succesfully");
        } else {
            System.out.println("Invalid Credentials");

        }


    }
}
