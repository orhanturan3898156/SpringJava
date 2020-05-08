package Day36_Static_Block;

import Day34_Custom_Class.Tester;

public class Static_Block3 {
    static String name;
    static  int num;

    static Tester tester1;

   /*

   public static void main(String[] args) {
        name="Muhtar";
        num=123;
        System.out.println(name);
        System.out.println(num);
    }

    */

   static {
       name="Muhtar";
       num=123;

   }

}
