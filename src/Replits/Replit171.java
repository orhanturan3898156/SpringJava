package Replits;


public class Replit171 {
    public static void main(String[] args) {
        String str = "abcd";
        int num = 2;
        String result = limit(str, 2);
        System.out.println(result);


    }

    public static String limit(String text, int maxLength) {

        String result = "";

        String[] arr = text.split("");

        for (int i = 0; i < maxLength; i++) {
            System.out.print(arr[i]);
        }


        return result;
    }
}
