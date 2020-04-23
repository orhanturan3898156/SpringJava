package Day25_Methods;

public class Return_Statement {
    public static void main(String[] args) {
        /*

        if(10 >9){

            return;  // exits the current method only

        }



        System.out.println("Hello");

        */


        method1();


        System.out.println("Hello");


    }


    public static void method1() {

        if (10 > 9) {

            return;

        }

        System.out.println("Hello Cybertek");

    }


    public static void method2() {
        if (10 > 9) {

            System.exit(0); //exit to entire system

        }


        System.out.println("Hello Cybertek");

    }
}
