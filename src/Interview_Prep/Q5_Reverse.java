package Interview_Prep;

public class Q5_Reverse {
    public static void main(String[] args) {

        String word = "Cybertek";

        String result = reverse2(word);
        System.out.println(result);

    }

    public static String reverse(String str) {
        String reversedWord = "";

        int lastIndex = str.length() - 1;
        for (int i = lastIndex; i >= 0; i--) {

            reversedWord += str.charAt(i);
        }
        return reversedWord;


    }

    public static String reverse2(String word) {

        String str = new StringBuilder(word).reverse().toString();
        return str;

    }

}
