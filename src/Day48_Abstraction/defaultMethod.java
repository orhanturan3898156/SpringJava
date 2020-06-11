package Day48_Abstraction;

abstract class T {
    /*
    public default void method2(){          //WILL NOT USE IT.

    }
    does not work.
     */
}

public interface defaultMethod {

    default void method() {
        System.out.println("Default method");
    }

    public static void main(String[] args) {
        // method();
        // defaultMethod obj=new defaultMethod();


    }

    class N implements defaultMethod {
        public static void main(String[] args) {
            N obj = new N();
            obj.method();
        }

    }

}
