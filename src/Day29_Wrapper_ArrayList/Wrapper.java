package Day29_Wrapper_ArrayList;

import javax.swing.*;

public class Wrapper {
    public static void main(String[] args) {
        /*
        Data Structure:
        1.Array
        2.Collections
        3.Maps


        primitives:byte,short,int,long,float,double, char, boolean

        Wrapper Classes: classes that are dedicated to primitives
        byte,short,int,long,float,double, Character, boolean

        presented in "java.lang" package

        */

        int a = 100;  //primitive
        Integer b = a; //wrapper class


        short s1 = 200;
        int n1 = s1;//200


        //Integer N1=s1; //>>doesnt accept

        Integer n2 = n1;


        System.out.println("==================================================================");

        int a1 = 20;
        float f1 = a1;

        //Float f2=a1; >>no


        Integer I1 = 200;
        int a2 = I1;

        Byte B1 = 126;
        int a3 = B1;



        System.out.println(a3);


    }
}
