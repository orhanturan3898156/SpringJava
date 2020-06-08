package Day47_Abstraction;

abstract class A {//parent
    public abstract void method1();

    public void method2() {
    }


}

public class Abstract_VS_NonAbstract2 extends A {//MANDATORY to override the abstract methods //child

    @Override
    public void method1() {

    }
}

abstract class B extends A { //optional to override the abstract method of A
//we have one abstract and one instance method


}

class C extends B { //firstly,it gives compile error. Reason is we inherited class B. Class B brings everything it has.B has an abstract methhod so we have to generate it in the class C.
    //Shortly, when a abstract inherited by a regular class, we have to override the abstract method.
    //But if it is abstract, then no need to override.


    @Override
    public void method1() {

    }
}
