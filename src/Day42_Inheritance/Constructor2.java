package Day42_Inheritance;
/*
1. at least one parent class has to be called in the sub class.
2.if the constructor in the parent class is default, it is called automaticly.
3.if the parent constructor is not default , it must be called manually by using "super()" keyword.


we have to use "super()" keyword, instead of "this()"

 */
/*

this() >>>
this.

super()
super. >>>


 */

class Test {
    public Test(int a) {
        System.out.println("A");
    }
    public Test(double a){
        System.out.println("C");
    }
}

public class Constructor2 extends Test {
    public Constructor2() {
        super(5);
        System.out.println("B");

    }

    public static void main(String[] args) {
        Test obj=new Test(10);

        System.out.println("===========");

        Constructor2 obj2=new Constructor2();

        System.out.println("===========");

        Constructor2 obj3=new Constructor2();

    }

}
