package Replits.String_Manupilation;

import java.util.Scanner;

public class Replit70 {
    public static void main(String[] args) {
        /*
        alejandro have started learning java, he knows what you know about ifs and strings.

       he has a large number of text emails, going trough all of them will take a lot of time.
       to save time he will only read the emails that refer to him by name.

       he wants to write a program that gets a string (the email) and determines if his name "alejandro"
       appears in that string. if so it will output "read this mail" else it will output "dont read".

       --------------------------------
       as Alejandro is time is precious and even with his little knowledge of programming he managed to save some time. but still he had a lot of emails to read.

       he wants to add more conditions to his program,
       he wants only job related mails so he will narrow it down by also checking
        if the word "project" also appears beside his name, that way he will be sure its a job email that refers to him.
         */
        Scanner scan = new Scanner(System.in);
        String email = scan.nextLine();

        if (email.contains("alejandro") && email.contains("project")) {
            System.out.println("read this email");
        } else {
            System.out.println("do not read");
        }


    }
}
