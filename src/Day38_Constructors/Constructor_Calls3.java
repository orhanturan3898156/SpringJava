package Day38_Constructors;

public class Constructor_Calls3 {
    /*
    5.Execution of constructor depends on OBJECT
    6.constructor CANNOT call itself
    7.

     */

    public Constructor_Calls3() {
        this(9);
        System.out.println("Default");
        //this(9) we CANNOT call it beacuse it has to be called in the first step.
    }

    public Constructor_Calls3(int a) {

        System.out.println("int argument");
    }

    public Constructor_Calls3(String str) {
        // this("Hello"); constructor CANNOT call itself, but can call others
    }


    public void method1() {
        //this(); it doesnt work beacuse only constructor can call constructor.
    }

    public static void main(String[] args) {
        Constructor_Calls3 obj = new Constructor_Calls3();//we called default const.
        // and it will print firstly int argument and then default
    }


}
