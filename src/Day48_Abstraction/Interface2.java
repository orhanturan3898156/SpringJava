package Day48_Abstraction;

public interface Interface2 {
    /*
    let's create an constructor
    public Interface2(){
                                    >>>we cannot. We use Constructor for object. Here interface is pure abstract.Means not concrete.
    }
     */

    /*
    instance method
    public void method1(){
                                   >>we cannot

    }
    //while instance variable is not possible to give (it automatically static and final), we cannot create instance variable and block


     */

    public void method1();

    int a = 100; //Actually it looks like this "public  static  final int a = 100;"
    public static final int b=200;

    public static void main(String[] args) {

        System.out.println(a); //by default static
        // a=200; //It doesnt allow us to re-assigned  //we cannot assign a value to final variable.

        System.out.println(Interface2.a);
        Interface2.method4();

    }

    public static void method4() {

    }

    void method5();

}
