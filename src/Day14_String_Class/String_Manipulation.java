package Day14_String_Class;

public class String_Manipulation {
    public static void main(String[] args) {

        //indexof() -->it returns the index of first occured character as an int
        String str="I like to learn Java. I like to watch the movie Jumanji";
        int a1=str.indexOf("Jum");
        System.out.println(a1);

        int a3=str.indexOf(" I");
        System.out.println(a3);

        System.out.println("=================================\n");

        String s="I like Java, and I like reading";
        int b1=s.lastIndexOf("I");
        System.out.println(b1);

        System.out.println("=================================\n");

        int b2=s.lastIndexOf("l");
        System.out.println(b2);

        System.out.println("=================================\n");

        String z="I like C#, C# is cool";
        int c1=z.indexOf(", C");
        int c2=z.lastIndexOf("C");
        System.out.println(c1+1+1);
        System.out.println(c2);

        System.out.println("=================================\n");

        String x="I like Java, Java is fun, Java programming is fun";

        int d1=x.indexOf("Java is");
        System.out.println(d1);

        int d2=x.indexOf("mming");
        System.out.println(d2);

        int d3=x.indexOf(", J")+2;
        System.out.println(d3);

        char ch1=x.charAt(37);
        System.out.println(ch1);




    }
}
