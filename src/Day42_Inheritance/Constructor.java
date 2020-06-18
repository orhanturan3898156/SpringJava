package Day42_Inheritance;

/*
1. at least one parent class has to be called in the sub class.
2.if the constructor in the parent class is default, it is called automaticly.



 */
class test { //parent
    public test() {
        System.out.println("super class default constructor");
    }

}

//        subclass           super class
public class Constructor extends test { //child

    public Constructor() {
        System.out.println("sub class default constructor");
    }

    public static void main(String[] args) {

        Constructor obj = new Constructor();
        System.out.println("============================");
        test obj2 = new test();


    }

}
