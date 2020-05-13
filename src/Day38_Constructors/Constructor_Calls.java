package Day38_Constructors;

public class Constructor_Calls {
    /*
    >>>> IMPORTANT >>>>  Only constructor can call constructor
     */
    public Constructor_Calls() {
        method1();
        method2(); //constructor can call both of them

    }

    public Constructor_Calls(int a) { //overloaded constructor
        // Constructor_Calls(); we cannot call it by its name. We have to use "this()" key word
        this(); //it called above constructor. how do we know? because it doesnt have any parameter in it.

    }

    public static void method1() {
        //method2(); // we cannot call it.because static only accepts static
        //Constructor_Calls(); we cannot call constructor

    }

    public void method2() {
        method1(); //we can call method1. because static can be called

    }

}
