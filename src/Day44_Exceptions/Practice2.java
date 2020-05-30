package Day44_Exceptions;

public class Practice2 {
    public static void main(String[] args) {
        System.out.println("Hello");
        waits(2);
        System.out.println("World");




    }
    public static void waits(int second){
        try {
            Thread.sleep(second*1000);
        } catch (Exception e) {

        }
    }
}
