package Resources;


import java.util.Arrays;

public class Library2 {
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

    public static String Palindrome(String word) {
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        if (word.equalsIgnoreCase(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
        return reversed;
    }

    public static String getDriver1(String browserName) {


        switch (browserName.toLowerCase()) {

            case "chrome":
                return "Chrome Driver";

            case "firefox":
                return "Firefox Driver";


            case "safari":
                return "Safari Driver";

            case "edge":
                return "Edge Driver";

            case "opera":
                return "Opera Driver";

            default:
                return "Invalid Driver";


        }


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
}
