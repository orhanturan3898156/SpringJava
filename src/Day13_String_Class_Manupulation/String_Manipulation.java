package Day13_String_Class_Manupulation;
public class String_Manipulation {
    public static void main(String[] args) {


        String str = "CyberTek";
        //          01234567
        char ch1 = str.charAt(5);
        System.out.println(ch1);
        System.out.println(ch1 == 'A');
        System.out.println(ch1 == 'T');
        System.out.println("=================================\n");

        //lenght method
        int totalLenght = str.length();
        System.out.println(totalLenght);
        System.out.println(totalLenght > 10);//it has to be false
        System.out.println(totalLenght == 8);

        String str2 = "Today is great day, Java is Fun";
        int maxIndexNum = str2.length() - 1;
        System.out.println(maxIndexNum);

        System.out.println("=================================\n");

        //concat Method==>concats the given value to the String and returns a new value
        String s1 = "CyberTek";
        s1 = s1.concat(" School");
        System.out.println(s1);

        String s2 = "Java";
        //s2=s2.concat(" is a programming language.");
        System.out.println(s2.concat(" is a programming language."));

        String r1 = "Java is fun";
        r1 = r1.concat(", and it is easy");//if you print r1.concat(", and it is easy"); it will give "Java is fun"
        System.out.println(r1);

        System.out.println("=================================\n");

        String name1 = "CYBERTEK";
        name1 = name1.toLowerCase();
        System.out.println(name1);

        System.out.println("=================================\n");
        String name2="cybertek school";
        name2=name2.toUpperCase();
        System.out.println(name2);

        System.out.println("=================================\n");
        //trim -->removes space/s and returns
        //only removes spaces which is not seperating the words


        String A1="     Today is        a great day";
        A1=A1.trim();
        System.out.println(A1);

        System.out.println("=================================\n");



    }
}
