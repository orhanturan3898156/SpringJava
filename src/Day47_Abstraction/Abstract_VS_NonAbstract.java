package Day47_Abstraction;

/*
non-abstract class:
         can not: Abstract methods
         can: constructor, instance method, static method,instance block, static block, instance varibale,static variable ....

Abstract Class:
         cannot:no OBJECT cannot be created , cannot be FINAL
         can: constructor, instance method, static method,instance block, static block, instance varibale,static variable ,AND ABSTRACT....


 */

class Test1 {
    public Test1() {//constructor

    }

    public void method1() {//method

    }

    public static void mehod2() {

    }

    // public abstract void method3(){} >>>we cannot create abstract method , in non-abstract class.
    int a = 100;
    static int b = 200;


}

abstract class Test2 {

    public Test2() {

    } //constructor

    public void method1() {
    }//instance method

    public static void method2() {
    }//static method

    public abstract void method3();//abstract method

    int a = 100;
    static int b = 200;


}

public class Abstract_VS_NonAbstract {
}
