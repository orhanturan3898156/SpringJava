package Day48_Abstraction;

interface A1 {
    void method1(); //this is actually public
}

interface B1 {
    abstract void method2(); //this is actually public
}

interface C1 {
    public abstract void method3(); //this is actually public
}

public class Abstraction02 implements A1, B1, C1 { //it gave compile error.Reason was we needed to override them.

    public void method1() {

    }

    public void method2() {

    }

    public void method3() {

    }


}
