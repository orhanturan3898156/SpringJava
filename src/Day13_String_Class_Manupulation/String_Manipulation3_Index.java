package Day13_String_Class_Manupulation;

public class String_Manipulation3_Index {
    public static void main(String[] args) {
        //indexOf(Value)---->helps to returns the index number of the first occured character as an integer.

        String str="I like Java programming John";
        int num1=str.indexOf("John");
        System.out.println(num1);

        System.out.println("=================================\n");

        String str2="CyberTek school is awesome";
        int num2=str2.indexOf("s");
        int num3=str2.indexOf("is");
        System.out.println(num2);
        System.out.println(num3+1);

        int maxindexnumber="Cybertek".length();
        System.out.println(maxindexnumber-1);

        System.out.println("=================================\n");

        // lastIndexOf--->

        String fullname="Orhan Turan";
        String firstname=fullname.substring(0, fullname.indexOf(" "));
        String lastname=fullname.substring(fullname.indexOf(" ")+1);

        System.out.println(firstname);
        System.out.println(lastname);


    }
}
