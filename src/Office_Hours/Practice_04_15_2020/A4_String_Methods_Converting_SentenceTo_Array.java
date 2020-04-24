package Office_Hours.Practice_04_15_2020;

import java.util.Arrays;

public class A4_String_Methods_Converting_SentenceTo_Array {
    public static void main(String[] args) {
        /*
        Split
        toCharArray
         */

        String name="cybertek";
        char[] chx=name.toCharArray();
        System.out.println(Arrays.toString(chx));

        /*
        str1="abc", str2="cab"

         */

        String str1="abc";
        String str2="bac";

        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(Arrays.equals(ch1,ch2));

        System.out.println("\n===================\n");

        String sentence="I like to learn Java";

        String[] words=sentence.split(" ");
        System.out.println(Arrays.toString(words));
        int totalnumberofwords=words.length;

        System.out.println(totalnumberofwords);

        for (int i=words.length-1;i>=0;i--){
            System.out.print(words[i]+" ");
        }







    }
}
