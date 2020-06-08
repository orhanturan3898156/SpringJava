package Day48_Abstraction;
/*
We can use extend and interface at the same time.
 */

interface P {
    void method1();
}

interface Q {
    void method2();
}

abstract class R {
    abstract void method3();
}

public class extends_implements2 extends R implements P, Q {//We can use extend and interface at the same time.

    public static void main(String[] args) {
        //R  obj=new R();  not concrete >>>object comes from class,not abstract.

        //Q obj2=new Q();  not concrete >>>object comes from class,not abstract.
        //we cannot have contructor in interface,becuase contructor is for calling objects.


    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }

}
