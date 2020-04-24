package Day14_String_Class;

import java.util.Scanner;

public class String_Manipulation2_Empty_Equals {
    public static void main(String[] args) {
        //EMPTY-->identfy if String is empty or not
        //true-->empty , false-->not empty

        String str=" ";
        boolean bool1=str.isEmpty();
        System.out.println(bool1);

        String username="";
        if (username.isEmpty()){
            System.out.println("Please provide the user name");
        }
        System.out.println("=================================\n");

        //EQUALS --> checks if two String's visible texts are equal or not
        // we don't use == (this) , it create string object

        String s1="Cat"; //string literal
        String s2=new String("Cat"); //string heap

        System.out.println(s1==s2);

        System.out.println(s1.equals(s2));

        String z1="Tiger";
        String z2=new String("Tiger");
        String z3="Tiger";
        String z4="Lion";

        System.out.println(z1==z2);
        System.out.println(z2==z3);
        System.out.println(z1==z3);

        System.out.println(z1.equals(z2));
        System.out.println(z1.equals(z3));
        System.out.println(z3==z4);

        System.out.println("=================================\n");

        /*
        username:cyberTek
        password:cybertekschool
         */

        Scanner scan=new Scanner(System.in);







    }
}
