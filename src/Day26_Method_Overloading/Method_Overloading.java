package Day26_Method_Overloading;

public class Method_Overloading {

    /*Method Overloading means multiple methods sharing the same name,
    but parameter MUST be different (either datatype or number of parameter)

   >>>sumoftwonumber,sumofthreenumbers,sumofforunumbers : NOT a good practice
   >>>create a sum>>>eventally it will ask you to put data accoridngly>> BETTER

   BENEFITS;
   -easy to read
   -reusable
   -easy to remember
   -very flexible

     */
    public static void main(String[] args) {

        method(10);
        method(10.0);


    }

    public static void method(int a) {
        System.out.println("Original Method");

    }

    public static void method(double a) {
        System.out.println("Overloaded Method");
    }
}
