package Day46_Final_Abstract;

public class Final_Method {
    //MAINLY, we cannot override the methods when it has final.
    //any method can be overloaded

    public final void method1() {

    }

    public final int method1(int a) {
        return 100;
    }

    public final static void main(String[] args) { //STATIC cannot be overridden.

    }

    public  Final_Method(){ //WE CANNOT apply FINAL keyword to constructor.FINAL doesn't work with final.

    }







}
