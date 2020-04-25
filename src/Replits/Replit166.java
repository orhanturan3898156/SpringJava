package Replits;

public class Replit166 {
    public static void main(String[] args) {
        String one = "orhan";
        String two = "turanxyz";

       String result= mergeStrings(one,two);
        System.out.println(result);


    }

    public static String mergeStrings(String one, String two) {
        //String a="orhan"
        //string b="turan"
        //String result="otruhraann"

        String result="";
        String leftletters="";
        String[] onearr=one.split("");
        String[] twoarr=two.split("");

        int loopsize=0;

        if (onearr.length>twoarr.length){
            loopsize=twoarr.length;
            leftletters=one.substring(twoarr.length);


        }else {

            loopsize=onearr.length;
            leftletters=two.substring(onearr.length);


        }

        for (int i=0;i<loopsize;i++){

            result+=onearr[i] +twoarr[i] +"";


        }





        return result+leftletters;



    }
}
