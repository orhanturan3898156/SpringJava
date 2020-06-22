import java.util.Arrays;
import java.util.Scanner;

public class Self_Study {


    public static void main(String[] args) {
        //day18
        //gift card 035
        //Replit 047,056 back to look

        // username=cybertek
        //password=cybertek123


        Scanner input = new Scanner(System.in);
        System.out.println("Enter User name");
        String username = input.next();

        System.out.println("Enter Pass Word");
        String password = input.next();

        boolean valid = (username.equals("cybertek") && password.equals("cybertek123")); // false
        // validating the first username and password

        int count = 1;
/*
        while( ! valid   ){
            // !true
            System.out.println("Please re enter your credentions");
            System.out.println("Enter User name");
            username  = input.next();

            System.out.println("Enter Pass Word");
            password  = input.next();

            valid = (username.equals("cybertek") && password.equals("cybertek123") );  // true
            // validating new username and passwords

            count++;
            if(count ==3 && ! valid ){ // already have three attempts and credentials are still incorrect
                System.out.println("Your account is locked");
                break;
            }

        }

 */


        if (valid) { // credentials are correct
            System.out.println("logged in");
        }

        if (!valid) {
            while (!valid) {
                System.out.println("re-enter");
                System.out.println("Enter User name");
                username = input.next();

                System.out.println("Enter Pass Word");
                password = input.next();
                count++;

                valid = (username.equals("cybertek") && password.equals("cybertek123")); // false
                if (valid) {
                    System.out.println("logged in");
                    break;
                }
                if(count==3 && !valid){
                    System.out.println("locked");
                    break;
                }

            }
        }


    }
}
