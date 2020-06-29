package Day52_Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Practice {
    /*
1.write a program that can remove the duplicated chracters from String and store them into variable
2.write a program that can  identify if two strings are build out of the same letters
     */
    public static void main(String[] args) {

        String str = "ABABABCDEF"; //["A","B","C","D","E","F"]

        String[] arr = str.split("");
        /*
        1.way
        System.out.println(Arrays.toString(arr));

        LinkedHashSet<String> ls=new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(ls);

        String result="";
        for (String each:ls){
            result+=each;
        }
        System.out.println(result);


         */ //first way

        str = "";
        for (String each : new LinkedHashSet<>(Arrays.asList(arr))) {
            str += each;
        }
        System.out.println(str);

        System.out.println("===============================================");
        //2.write a program that can  identify if two strings are build out of the same letters
        /*
        str1="abababab"   ab
        str2=baba"        ba
         */

        String str1 = "abababab";//[a,b]
        String str2 = "baba";//[a,b]
         /*
        String[] arr1=str1.split("");
        String[] arr2=str2.split("");

        TreeSet<String> t1=new TreeSet<>(Arrays.asList(arr1));
        System.out.println(t1);

        TreeSet<String> t2=new TreeSet<>(Arrays.asList(arr2));
        System.out.println(t2);


        str1=t1.toString();
        str2=t2.toString();

        boolean result=str1.equals(str2);
        System.out.println(result);

 */

        str1=new TreeSet<>(Arrays.asList(str1.split(""))).toString();
        str2=new TreeSet<>(Arrays.asList(str2.split(""))).toString();

        System.out.println(str1.equals(str2));


    }
}
