package Day35_Static;

public class Static_Variables {

    int a2 = 100; //instance variable

    static int a3 = 300; //static variable

    public static void main(String[] args) {
        /*
        static: class member, can be called through the class.
        there is only one copy of static shared by all objects.

        static mebers;
           -static variable
           -static methods
           -static initializer block
           -static nested class

         */


        /*
        local variable:variables in the block are called local variables.
        instance variable:declares outside the block.

        static variable; it is also decleared outside the block with static keyword.

         */

        int a1 = 100;  //local variable

        Static_Variables obj1 = new Static_Variables();
        obj1.a2 = 1000;

        obj1.a3 = 4000;


        Static_Variables obj2 = new Static_Variables();
        obj2.a2 = 2000;

        obj1.a3 = 5000;


        System.out.println(obj1.a2);
        System.out.println(obj2.a2);


        System.out.println(obj1.a3);//4000
        System.out.println(obj2.a3);
        System.out.println(obj2.a3);


    }
}
