package Replits;

import java.util.ArrayList;
import java.util.Arrays;

public class AssessmentTest {
    public static void main(String[] args) {
        String[] arr={"orhan","elif","mehmet","yusuf"};

       String[] arr2=new String[arr.length];
       int j=arr.length-1;

        for (int i = 0;i<arr.length ; i++) {

            arr2[i]=arr[j];
            j--;


        }
        System.out.println(Arrays.toString(arr2));




    }



}
