package Day29_Wrapper_ArrayList;

public class Parse_Method {
    public static void main(String[] args) {
        /*
        it is used
         */

        String str = "123";
        int a1 = Integer.parseInt(str);
        System.out.println(str + 1); //Text
        System.out.println(a1 + 1);  //number

        /*if you add any number you can understand if it int or text.
        because num will add, but text concate
        */

        byte b1 = Byte.parseByte(str); //will return byte primitive //
        System.out.println(b1 + 5); //to understand if it is number or text, add number

        Integer I1 = (int) Byte.parseByte(str);  //autoboxing

        System.out.println("===========================================");

        String str2 = "10.5";
        float f1 = Float.parseFloat(str2);
        System.out.println(f1);

        System.out.println("===========================================");

        String str3 = "3147483647"; //this is bigger than max of int. We cannot assign to int because it is bigger than int now.
        long num1 = Long.parseLong(str3);
        System.out.println(num1);

        Long num2 = Long.parseLong(str3);
        System.out.println(num2);

        System.out.println("===========================================");

        String result1 = "true";
        boolean r1 = Boolean.parseBoolean(result1);
        System.out.println(r1); //to verify you can put !, it will gives you oppsite result

        String result2="Today is Monday";
        boolean r2=Boolean.parseBoolean(result2); //since it is not true or false it gives false.
        // other than true, it will return false always
        //if you write TRue>>will return true again.
        System.out.println(r2);


    }
}
