package Day5_Casting_Unary_ShortHandOperators;
public class UnaryOperators {
    public static void main(String[] args) {
        //unary operators are;+,-,--,++,!
        int a = 10;
        int b = +a; //you can either put + or not.

        int a2 = -10;
        boolean result1 = a2 > 0;
        boolean result2 = a2 < 0;
        System.out.println(result1);
        System.out.println(result2);

        int Z = 100;
        System.out.println(++Z);
        System.out.println(Z);

        int P = 100;
        System.out.println(P++);
        System.out.println(P);

        System.out.println("========================");


    }
}
