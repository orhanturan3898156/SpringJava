package Day52_Collection;

import Day48_Abstraction.Interface3;

import java.util.ArrayList;
import java.util.TreeSet;

public class null_Keyword {

    static String str = new String("Cybertek");

    static ArrayList<Integer> list;

    public static void main(String[] args) {

        //System.out.println(str.charAt(1));//NullPointerException runtime exception(unchecked)
        // System.out.println(str.toUpperCase()); //NullPointerException runtime exception(unchecked)
        System.out.println(str.charAt(1));

        // System.out.println(list.get(1));//NullPointerException
        //NullPointerException : when you see this exception, that means you most probably did not initiate the variable.

        String str2 = null; //returns null
        Interface3 i1 = null;
        System.out.println(str2);

        //int num=null; int doesnt accept null.

        ArrayList<String> list1 = new ArrayList<>();
        list1.add(null);

        System.out.println(list1);

        System.out.println("=======================================================");

        String[] arr = {null, "CyberTek", null};
        //arr[2].toUpperCase();//null is not object of string that's why it will gives you exception.

        String name1 = "cybertek".toUpperCase();
        name1 = null;

        System.out.println(name1);//retuns null. null doesn't belong to any object.
        //name1.toUpperCase();     //NullPointerException


    }
}
