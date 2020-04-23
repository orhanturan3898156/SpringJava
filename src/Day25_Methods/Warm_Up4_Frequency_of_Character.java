package Day25_Methods;

import Resources.Library;

public class Warm_Up4_Frequency_of_Character {
    public static void main(String[] args) {

        String str = "AABBCC";                                       //A2B2C2
        String NonDup = Library.removeDuplicate(str);                //ABC
        String result="";

        for(int i=0;i<NonDup.length();i++){ //ABC
            String ch =""+ NonDup.charAt(i); //A
            int num=Library.frequency(str,ch);
            result=ch+num;
        }
        System.out.println(result);

        String str2=frequencyOfChar(str);
        System.out.println(str2);


        String abc="FFFDCCCCCAA";
        String result4=frequencyOfChar(abc);
        System.out.println(result4);






    }


    public static String frequencyOfChar(String str){
        //String str = "AABBCC";


        String NonDup = Library.removeDuplicate(str);                //ABC
        String result="";

        for(int i=0;i<NonDup.length();i++){
            String ch =""+ NonDup.charAt(i); //A
            int num=Library.frequency(str,ch);
            result+=ch+num;
        }

        return result;



    }
}
