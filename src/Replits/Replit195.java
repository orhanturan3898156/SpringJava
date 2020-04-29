package Replits;

import java.util.ArrayList;
import java.util.Arrays;

public class Replit195 {
    public static void main(String[] args) {

        String word1="star";
        String word2="rats";

        char[] arr1=word1.toCharArray();
        Arrays.sort(arr1);

        char[] arr2=word2.toCharArray();
        Arrays.sort(arr2);

        boolean result=Arrays.equals(arr1,arr2);
        System.out.println(result);




    }

}
