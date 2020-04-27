package Day29_Wrapper_ArrayList;

import java.util.Arrays;

public class Value_of_Method {
    public static void main(String[] args) {
        /*
        converting string to wrapper class value
         */

        String str = "123";
        Integer a = Integer.valueOf(str); //returns wrapper class
        System.out.println(a + 1);

        double b = Integer.valueOf(str);
        System.out.println(b);

        String str2 = "15.5";
        double d1 = Double.parseDouble(str2);
        //double=double   none
        double d2 = Double.valueOf(str2);
        //double=Double unboxing

        System.out.println(d1);
        System.out.println(d2);

        System.out.println(d1 == d2);

        System.out.println("==========================================");

        int z1 = 2000;
        Short sh1 = 3000;
        int z2 = sh1;
        System.out.println("==========================================");

        String r1="Today is Monday"; //if you give anything other than true, returns false. same with parse method
        //value of method also not case sensitive like parse method.
        Boolean t1=Boolean.valueOf(r1);

        boolean t2=Boolean.valueOf(r1); //unboxing

        System.out.println(t1);
        System.out.println(t2);

        System.out.println("==========================================");

        int maxMum=Integer.MAX_VALUE;
        System.out.println(maxMum);

        double maxNum2=Double.MAX_VALUE;
        System.out.println(maxNum2);

        int minNum=Integer.MIN_VALUE;
        System.out.println(minNum);

        byte maxNum3=Byte.MAX_VALUE;
        System.out.println(maxNum3);
        System.out.println(Byte.MIN_VALUE);

        System.out.println("==========================================");

        int[] arr=new int[3];
        System.out.println(Arrays.toString(arr));

        Boolean[] arr2=new Boolean[3];
        //Integer ,Double >>whatever you give will returns [null,null,null]
        //All of wrapper classes' default values are null.
        /*

        default value of primitives;
        byte,short,int,double : 0
        float,double :0.0;
        boolean: false
        char:empty,space

         */
        System.out.println(Arrays.toString(arr2));




    }
}
