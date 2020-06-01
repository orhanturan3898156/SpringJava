package Day5_Casting_Unary_ShortHandOperators;

public class Practice {
    public static void main(String[] args) {
        // whole numbers: byte, short, int, long
        // decimals: float, double

        int a1 = 100;
        System.out.println(a1);

        float f1 = (long)a1;
        // f1 = 100L;
        // f1 = 100.0;

        System.out.println(f1);

        long l1 =  (long)f1;
        //  l1 = 100

        System.out.println(l1);//100


        String name;


        //  System.out.println(name); // local variables cannot be used without initializing

        name = "Cybertek";  // in java: first come first serve
        System.out.println(name);

    }
}
