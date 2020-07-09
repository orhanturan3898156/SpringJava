package Interview_Prep;

public class Q7_SortingLetters_Numbers {
    /*
      Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together
      Ex:
      Input:  "DC501GCCCA098911"
      OutPut: "CD015ACCCG011899"
     */

    public static void main(String[] args) {
        String word="DC501GCCCA098911";

        String r1=numberLetters(word);
        System.out.println(r1);

    }

    public static String numberLetters(String str){

        char[] arr=str.toCharArray();
        String numbers="";
        String letters="";

        for( Character each:arr){

            if (Character.isDigit(each)){
                numbers+=each;
            }
            if (Character.isAlphabetic(each)){
                letters+=each;
            }

        }
        return letters+numbers;


    }
}
