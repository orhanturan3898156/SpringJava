package Day36_Static_Block;

public class Static_Block {

    /*
    static{
    statement}
    firstly static gets run
     */

    static {
        System.out.println("Hello World"); //>>>this will be executed first.
        // that means if you want to write something sout is not only option.
        //if you write under main nothing change.still static will be eexecuted first
    }

    public static void main(String[] args) {
        System.out.println("Hello CyberTek");
        method1();
    }

    static {
        System.out.println("Hello World"); //>>>this will be executed first.
        // that means if you want to write something sout is not only option.
        //if you write under main nothing change.still static will be eexecuted first/// >>>>see:)
    }

    public static void method1(){
        System.out.println("Custom method executed");
    }


}
