package Replits.String_Manupilation;

public class Replit72 {
    public static void main(String[] args) {
        /*
        In this task, you need to swap the first name with the last name in the email.
        If the email doesn't contain underscore - do not do anything
        Example:
        input: mike_tyson@gmail.com
        output: tyson_mike@gmail.com

        Example:
        input: barakobama@gmail.com
        output: barakobama@gmail.com
         */
        swap("orhan_turan@gamil.com");
        swap("orhanturan@gamil.com");


    }

    public static void swap(String email) {
        String result = "";
        if (email.contains("_")) {
            String firstName = email.substring(0, email.indexOf("_"));
            String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));

            result = lastName + "_" + firstName + "@gmail.com";
        } else {
            result = email;
        }
        System.out.println(result);


    }
}
