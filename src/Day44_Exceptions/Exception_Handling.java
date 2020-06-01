package Day44_Exceptions;

public class Exception_Handling {
    public static void main(String[] args) {
        String str = "CyberTek";

        try {
            System.out.println(str.charAt(100));
        } catch (Exception e) {
            String discription = e.getMessage();
            System.out.println(discription);
        }


        System.out.println("======================================");

        try {
            System.out.println(100 / 0);
            System.out.println("try block");
        } catch (Exception e) {
            System.out.println("catch block");
            String desciription = e.getMessage();
            System.out.println(e.getMessage());
        }


        System.out.println("completed");


    }
}
