package Replits.String_Manupilation;

public class Replit69 {
    public static void main(String[] args) {
        //Write a program that will print out first half of the word twice.
        halfOfWord("Orhan");


    }

    public static void halfOfWord(String word) {

        String result = "";
        int midIndex = (word.length() - 1) / 2;
        result = (word.length() % 2 == 0) ? word.substring(0, midIndex + 1) : word.substring(0, midIndex);
        System.out.println(result + result);


    }
}
