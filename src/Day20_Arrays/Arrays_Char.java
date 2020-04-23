package Day20_Arrays;

import java.util.Arrays;

public class Arrays_Char {
    public static void main(String[] args) {
        /*

        returns charArry
        toCharArray;
        String str="Batch 18";
        str.toCharArray();['B','a','t','c','h',' ','1','8']
         */

        String name="Orhan";
        char[] characters=name.toCharArray();
        String[] names={"Orhan"};

        System.out.println(characters);

        System.out.println(Arrays.toString(characters));
        System.out.println(Arrays.toString(names));


        String str1="Cybertek School";
        String str2="School Cybertek";

        char[] ch1=str1.toCharArray();
        System.out.println(Arrays.toString(ch1));
        char[] ch2=str2.toCharArray();
        System.out.println(Arrays.toString(ch2));

        System.out.println(Arrays.equals(ch1,ch2));

        //System.out.println(Arrays.toString(ch1));

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(Arrays.equals(ch1,ch2));

        System.out.println("\n=========================\n");










    }
}
