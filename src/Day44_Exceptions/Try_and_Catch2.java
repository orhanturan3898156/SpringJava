package Day44_Exceptions;

public class Try_and_Catch2 {

    public static void main(String[] args) {

        //IMPORTANT
        //unchecked (run time) exception run in "catch"
        //checked (after running) exception tun in "try"


        System.out.println("Hello");


        try {
            Thread.sleep(2000);
            System.out.println("try block");
        } catch (Exception e) {
            System.out.println("catch block");
        }

        System.out.println("World");

    }
}
