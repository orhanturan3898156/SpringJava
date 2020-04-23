package Day5_Casting_Unary_ShortHandOperators;

public class PrimitiveVariable_Practice {
    public static void main(String[] args) {

        //whole numbers;byte,short,int, long
        //decimal numbers; float, double
        int a1 = 100;
        float f1 = (long) a1; //f1=100L
        System.out.println(f1);
        System.out.println("===========================");
        int i1=456;
        double j1=i1;
        System.out.println(j1);
        System.out.println("============================");

        double k=234.56;
        int l= (int) k;
        System.out.println(l);




        System.out.println("============================");
        long l1 = (long) f1;  //it will gives 100 not 100.0 because long is not decimal
        System.out.println(l1);


        //***Local Variable; variable that are declared within the method.***//
        //must be initialized before using it//


    }
}
