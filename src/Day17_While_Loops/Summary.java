package Day17_While_Loops;

import java.util.Scanner;

public class Summary {
    public static void main(String[] args) {
        //username=cybertek
        //pass=cybertek123

        Scanner scan=new Scanner(System.in);
        System.out.println("enter username");
        String username=scan.next();
        System.out.println("enter password");
        String password=scan.next();
        int count=1;

        boolean valid=username.equals("cybertek") && password.equals("cybertek123");

        while (!valid){
            System.out.println("enter username");
            username=scan.next();
            System.out.println("enter password");
            password=scan.next();

            if (username.equals("cybertek") && password.equals("cybertek123")){
                break;
            }


        }

        if (username.equals("cybertek") && password.equals("cybertek123")){

            System.out.println("logged in");
        }

        System.out.println("++++++++++++++++++++++\n");

        System.out.println("enter yes or no");
        String answer=scan.next();
        boolean result=answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no");

        while (!result){
            System.out.println("please enter yes or no");
            answer=scan.next();

            if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")){
                break;
            }
        }
        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")){
            System.out.println("Thank you for your answer");
        }



    }
}
