package Day38_Constructors;

public class Constructor_Calls_Practice {
    public Constructor_Calls_Practice() {
        this(10.0);
        System.out.println("A");
    }

    public Constructor_Calls_Practice(int a) {
        this();
        // this(10.5); one constructor can only call one constructor.NOT MORE than ONE.
        System.out.println("B");
    }

    public Constructor_Calls_Practice(double b) {
        //this(); since default contructor has this double constructor, we cannot call it.(constructor CANNOT itself.
        //this(5.5); constructor CANNOT itself.
        //this(2); actually it is calling itself and it is not possible as said.
        System.out.println("C");
    }
}
