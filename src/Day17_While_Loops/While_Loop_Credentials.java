package Day17_While_Loops;

import java.util.Scanner;

public class While_Loop_Credentials {
    public static void main(String[] args) {

        // username=cybertek
        //password=cybertek123


        Scanner input = new Scanner(System.in);
        System.out.println("Enter User name");
        String username = input.next();
        System.out.println("Enter Password");
        String password = input.next();

        boolean valid=username.equals("cybertek") && password.equals("cybertek123");

        int count = 1;
        while (!(username.equals("cybertek") && password.equals("cybertek123"))) {
            System.out.println("Please re-enter your credentials");
            System.out.println("Enter User name");
            username = input.next();

            System.out.println("Enter Password");
            password = input.next();
            valid=username.equals("cybertek") && password.equals("cybertek123");

            count++;
            if (count == 3 && !valid) {
                System.out.println("Your account is locked");
                break;

            }
        }
        if (username.equalsIgnoreCase("cybertek") && password.equalsIgnoreCase("cybertek123")) {
            System.out.println("Logged in");
        }
    }
}
