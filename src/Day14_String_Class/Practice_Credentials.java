package Day14_String_Class;

import java.util.Scanner;

public class Practice_Credentials {
    public static void main(String[] args) {
        /*
        valid credentials are:
        username: cybertek;
        password: cybertekschool

        precondition:username and password cannot be empty
        if empty>> please enter credentials


        if user entered both valid username and password >>log in
        if valide password, invalid username >>>username is incorrect
        if valid username ,invalid password >>>password is incorrect
        if both invalid>>>>>invalid username and password
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("enter username");
        String username = scan.next();


        System.out.println("enter password");
        String password = scan.next();

        boolean loggedin = username.equals("cybertek") && password.equals("cybertekschool");
        boolean invalidusername = password.equals("cybertekschool") && !username.equals("cybertek");
        boolean invalidpassword = username.equals("cybertek") && !password.equals("cybertekschool");

        if (!username.isEmpty() && !password.isEmpty()) {
            if (loggedin) {
                System.out.println("Logged in");
            } else if (invalidusername) {
                System.out.println("password is correct, username is incorrect");

            } else if (invalidpassword) {
                System.out.println("username is correct, password is incorrect");

            } else {
                System.out.println("password and username is correct");
            }


        } else {
            System.out.println("Please enter credentials");
        }


    }
}
