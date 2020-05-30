package Day44_Exceptions;

public class Exception_Practice {
    public static void main(String[] args) {

        try {
            System.out.println("Hello");
            System.out.println("Hola");   ///it is not recommended to use all like this.
            System.out.println(9/0);
            System.out.println("CyberTek");
            System.out.println("Java");
        }catch (Exception e){
            System.out.println("catch block");
        }

    }
}
