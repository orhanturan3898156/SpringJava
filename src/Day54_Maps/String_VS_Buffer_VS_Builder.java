package Day54_Maps;

public class String_VS_Buffer_VS_Builder {
    public static void main(String[] args) {
        String str1 = "Cybertek";
        str1.concat(" School");

        System.out.println(str1);//Cybertek >>String is immutable

        System.out.println("========================================================");

        //Buffer and Builder is mutable versions of String

        StringBuilder builder = new StringBuilder("Cybertek");
        builder.append(" School");
        //this is how we create the String Builder
        // builder is not synchronized.


        System.out.println(builder);//Cybertek School

        System.out.println("========================================================");

        StringBuffer buffer = new StringBuffer("Cybertek"); // buffer is synchronized. slower.Thread safe.
        buffer.append(" School");
        System.out.println(buffer);

        System.out.println("========================================================");

        String word = "ABCD";

        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        System.out.println(sb);
        word = sb.toString();
        System.out.println(sb);


    }
}
