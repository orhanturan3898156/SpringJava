package Resources;

import java.util.Arrays;

public class Library {
    /*
     // remove duplicates from string
     // Frequency of string
     // merge two array and return third one
     // max number from array
     // min number from array
     */
    public static int[] sortDesending(int[] arr) {

        Arrays.sort(arr);// {1,2,3,4};  ==> {4,3,2,1};

        int[] RevArr = new int[arr.length];


        int j = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {

            RevArr[i] = arr[j];

            j--;

        }


        return RevArr;


    }


    public static String Reverse(String str) {

        String Reverse = "";


        for (int i = str.length() - 1; i >= 0; i--) {

            Reverse += str.charAt(i);

        }


        return Reverse;

    }






    public static String removeDuplicate(String str) {
        String result = "";  //AB

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!(result.contains("" + ch))) {
                result += ch;
            }

        }
        return result;

    }
    public static int frequency(String str1, String str2){


        int count=0;

        while (str1.contains(str2)){

            count++;
            str1=str1.replaceFirst(str2,"");


        }

        return count;




    }
    public static String frequencyOfChar(String str){


        String NonDup = Library.removeDuplicate(str);                //ABC
        String result="";

        for(int i=0;i<NonDup.length();i++){
            String ch =""+ NonDup.charAt(i); //A
            int num=Library.frequency(str,ch);
            result+=ch+num;
        }

        return result;



    }
}