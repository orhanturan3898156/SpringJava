package Day46_Final_Abstract;

public class final_practice {
    final int a = 10;
    final static int b = 20;

    static {

    }

    public final_practice() {

    }

    final public void method1() { //we can give final keyword before or after access modifier,but not preffred.

    }

    public final static void method2() {

    }




    class test extends final_practice {
        /*
    protected void method1(){ >>>> we cannot override method1 beacuse above it was final.

        }

         */





    }
}
