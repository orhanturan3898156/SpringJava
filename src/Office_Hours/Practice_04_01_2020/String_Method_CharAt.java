package Office_Hours.Practice_04_01_2020;

public class String_Method_CharAt {
    public static void main(String[] args) {
        String str="Java";
        char ch1=str.charAt(3);
        System.out.println(ch1);

        System.out.println("===================================");
        ///LENGTH

        String str2="Cybertek School";
        int numberofChar=str2.length();
        System.out.println(numberofChar);

        int maxindex=str2.length()-1;
        char ch3=str2.charAt(maxindex);
        System.out.println(ch3);

        System.out.println("===================================");

        //CONCAT (string)
        String str3="Cybertek";
        str3=str3.concat(" School");
        System.out.println(str3);

        System.out.println("===================================");
        //LOWER CASE

        String str5="CyberTek School";
        String lower=str5.toLowerCase();
        System.out.println(lower);

        System.out.println("===================================");

        String str6="cybertek school";
        String upper=str6.toUpperCase();
        System.out.println(upper);

        System.out.println("===================================");
        //TRIM>>>>>if there is any space not used will be removed

        String str7="      CyberTek School";
        System.out.println(str7.length());
        String trim=str7.trim();
        System.out.println(trim);
        System.out.println(str7.length());

        System.out.println("===================================");

        //SUBSTRING (begining index, ending index)>>>ending index willbe excluded!!!

        String sentence="I like Java";
        String sub=sentence.substring(0,5);//it is not going to include "e".
        System.out.println(sub);
        System.out.println(sentence.substring(0));
        System.out.println(sentence.substring(0,sentence.length()));

        System.out.println("===================================");

        //REPLACE  REPLACEFIRST

        String str8="I like C#, C# is cool";
        String t1=str8.replace("C#","Java");
        System.out.println(t1);

        System.out.println("===================================");

        //INDEXOF>>>returns to first matching character>>>as an int
        String y1="Today is Wednesday";

        int  a1=y1.indexOf("W");
        int a2=y1.indexOf("Wed");
        System.out.println(a1);
        System.out.println(a2);

        System.out.println("===================================");
        //LASTINDEXOF

        String y2="CyberTek School, School";
        int a3=y2.lastIndexOf("S");
        System.out.println(a3);











    }

}
