package Day25_Methods;

public class Warm_up2_Remove_Duplicate {

    public static void main(String[] args) {
         /*
    warmup task:
    1.  write a return method that accepts a String and removes duplicate values from the String
    Ex:
    RemoveDuplicate("aaabbbccc");  ==> "abc"

     */


        String str = "ABAB";
        String result = "";  //AB

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!(result.contains("" + ch))) {
                result += ch;
            }

        }
        System.out.println(result);

        String str2 = "ABCABCABC";
        String result2 = removeDuplicate(str2);
        System.out.println(result2);
        String str3="AAABBCCCCFGD";
        String result3=removeDuplicate(str3);
        System.out.println(result3);



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
}
