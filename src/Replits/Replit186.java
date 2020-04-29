package Replits;

public class Replit186 {
    public static void main(String[] args) {
        String s = "aa10aa#$%$%&^%&456";

        char[] arr = s.toCharArray();
        String result = "";

        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i])) {
                result += Integer.parseInt("" + arr[i]);
            }


        }
        System.out.println(result);

        String str2 = "aaa23242sdsfs";

        String a = extractNum(str2);
        System.out.println(a);


    }

    public static String extractNum(String s) {

        char[] arr = s.toCharArray();
        String result = "";

        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i])) {
                result += Integer.parseInt("" + arr[i]);
            }


        }
        return result;

    }

}
