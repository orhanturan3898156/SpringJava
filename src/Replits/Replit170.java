package Replits;

public class Replit170 {
    public static void main(String[] args) {

        String text="he said bla bla bla";
        String abc="bla";
        String result=clean(text,abc);
        System.out.println(result);


    }
    public static String clean(String text, String badWord){
        return  text.replace(badWord,"");


    }
}
