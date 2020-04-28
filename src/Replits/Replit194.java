package Replits;

public class Replit194 {
    public static void main(String[] args) {

        String name="Nurses run";
        boolean result=isPalindrome(name);
        System.out.println(result);



    }
    public static boolean isPalindrome(String check){
        check=check.replace(" ","");

        String result="";
        for (int i=check.length()-1;i>=0;i--){

            result+=check.charAt(i);



        }

        if (check.equalsIgnoreCase(result)){
            return true;
        }else {
            return false;
        }




    }


}
