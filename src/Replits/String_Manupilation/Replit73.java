package Replits.String_Manupilation;

public class Replit73 {
    public static void main(String[] args) {
        /*

         Write a program that will print out information about the user based on email.
         Print first and last name from the email with the upper case.
         (Assume that first and last names were separated by an underscore)

         Example:
         Input: craig_federighi@apple.com
         Output:
          name: Craig
         Last name: Federighi
         Domain: apple
         Top-Level Domain: com
         */
        String email = "craig_federighi@apple.com";
        String firstName = email.substring(0, email.indexOf("_"));
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);


        String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
        lastName = lastName.substring(0, 1).toUpperCase() + firstName.substring(1);


        String domain = email.substring(email.indexOf("@") + 1, email.indexOf("."));

        String topLevelDomain = email.substring(email.indexOf(".") + 1);

        System.out.println("Name: " + firstName + "\nLastName: " + lastName + "\nDomain: " + domain + "\nTop-Level Domain: " + topLevelDomain);


    }
}
