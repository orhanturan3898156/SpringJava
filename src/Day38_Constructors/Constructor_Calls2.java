package Day38_Constructors;

public class Constructor_Calls2 {
    /*
    1.only constructor can call constructor
    2.constructor cannot be called by its name only. We have to use "this()" keyword.
    3.constructor call MUST BE very first step. We have to call constructor first.otherwise it gives compile error.
    4.One constructor can ONLY call ONE constructor.
    for 5. and 6. check Constructor_Calls3 class

     */


    public Constructor_Calls2() { //this is default constructor
        System.out.println("default constructor");
    }

    public Constructor_Calls2(int a) {
        this(); //we called defualt constructor
        System.out.println("Constructor with int parameter");

    }

    public Constructor_Calls2(String str) {
        this(10);
        System.out.println("constructor with string argument");

    }

    public static void main(String[] args) {
        Constructor_Calls2 obj = new Constructor_Calls2(10); //default constructor called

        System.out.println("====================================================");

        Constructor_Calls2 obj2 = new Constructor_Calls2("str");


    }

    public void method1() {
        //Constructor_Calls2
        //constructor can be called only in constructor
    }
}
