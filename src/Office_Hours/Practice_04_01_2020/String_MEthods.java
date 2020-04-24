package Office_Hours.Practice_04_01_2020;
public class String_MEthods {
    public static void main(String[] args) {
        //EMPTY>>>chekcs if the String is empty;

        String str1="   ";


        System.out.println("===================================");
        //EQUALS>>it checks if two text visible same
        String s1="cat";
        String s2=new String("cat");
        String s3="Cat";


        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println("===================================");

        //IGNORECASE

        System.out.println(s1.equalsIgnoreCase(s3));

        System.out.println("===================================");
        //CONTAINS(STR)>>>it checks if the str included or not>>returns boolean

        String sentence="I like to learn Java";
        System.out.println(sentence.contains(sentence));




    }
}
