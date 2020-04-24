package Day14_String_Class;

public class String_Manipulation3_Equal_Ignore {
    public static void main(String[] args) {
        //EQUAL IGNORE CASE--->it check equalty of two strings
        // it doesnt care case sensivity,but EQUAL does.

        String str1="CYBERTEK";
        String str2="cybertek";

        System.out.println(str1.equals(str2)); //it is important for equalt case upper lower case
        System.out.println(str1.equalsIgnoreCase(str2)); //ignores case sensivity

        System.out.println("=================================\n");
        String gmail="cybertekschool@gmail.com";

        String userinputGmail="CybertekSchool@gmail.com";

        boolean result=gmail.equalsIgnoreCase(userinputGmail); //true

        if (result){
            System.out.println("Logged in");
        }else {
            System.out.println("Invalid");
        }





    }
}
