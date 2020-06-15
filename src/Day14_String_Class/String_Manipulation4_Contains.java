package Day14_String_Class;

public class String_Manipulation4_Contains {
    public static void main(String[] args) {

        String s1 = "CyberTek School";
        boolean r1 = s1.contains("School");
        System.out.println(r1);
        System.out.println(s1.contains("school"));

        System.out.println("=================================\n");

        /*
        valid password must contain special characters such as(!, _ , $)
        valid password should not contain space/s
         */

        String password = "mmasd1235";
        if (password.contains(" ")) {
            System.out.println("Invalid- cannot have space");

        } else {
            System.out.println("Valid");
        }


    }
}
