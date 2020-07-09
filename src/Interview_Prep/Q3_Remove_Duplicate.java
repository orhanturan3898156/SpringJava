package Interview_Prep;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Q3_Remove_Duplicate {
    /*
    Write a return method that can remove the duplicated values from String
    Ex:  removeDup("AAABBBCCC")  ==> ABC
     */
    public static void main(String[] args) {

        String word="AAABBBCCCDFF";

        String r1=removeDuplicate2(word);
        System.out.println(r1);

    }

    public static String removeDuplicate(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += str.charAt(i);
                str = str.replaceFirst("" + str.charAt(i), "");
            }

        }
        return result;

    }

    public static String removeDuplicate2(String str){

        String[] arr=str.split("");

        Set<String> list=new LinkedHashSet<>(Arrays.asList(arr));
        String result="";
        for (String each:list){
            result+=each;
        }

        return result;

    }

}
