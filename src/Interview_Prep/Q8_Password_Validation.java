package Interview_Prep;

public class Q8_Password_Validation {
    /*
    1. Write a return method that can verify if a password is valid or not.
    requirements:
    1. Password MUST be at least have 6 characters and should not contain space
    2. PassWord should at least contain one upper case letter
    3. PassWord should at least contain one lowercase letter
    4. Password should at least contain one special characters
    5. Password should at least contain a digit

 if all requirements above are met, the method returns true, otherwise returns  false
     */
    public static void main(String[] args) {

        String password = "Orhan156";
        boolean hasUpper = password.matches("(.*[A-Z].*)");
        boolean hasLower = password.matches("(.*[a-z].*)");
        boolean hasnumbers = password.matches("(.*[0-9].*)");
        boolean specialchars = password.matches("(.*[ -/, :-@].*)");
        boolean valid = hasLower && hasLower && hasnumbers && specialchars;


       if (password.length() >= 6 && !password.contains(" ") && valid) {

           System.out.println("great");
        }
       else {
           System.out.println("sorry");
       }



    }
}
