package Replits;

public class ExtractNumbers {
    public static void main(String[] args) {
        String str="aa2aa3";

        String result=extractNumber(str);
        System.out.println(result);
        

    }

    public static String extractNumber(String s){
        char[] chars=s.toCharArray();

        String result="";
        for (int i=0;i<chars.length;i++){
            if (Character.isDigit(chars[i])){
                result+=chars[i];
            }
        }
        return result;
    }
}
