package Day44_Exceptions;

public class Practice {
    public static void main(String[] args) {
        /*
        print Hello. After 2 seconds.
         print "CyberTek".
         wait 3 seconds
         print "Java"

         */

        System.out.println("Hello");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }
        System.out.println("CyberTek");

        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }
        System.out.println("Java");

        try {
            Thread.sleep(4000);
        } catch (Exception e) {

        }
        System.out.println("Completed");


    }

}
