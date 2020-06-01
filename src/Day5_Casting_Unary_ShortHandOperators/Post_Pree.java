package Day5_Casting_Unary_ShortHandOperators;

public class Post_Pree {

    public static void main(String[] args) {
        //pre:change variable immediately
        int a = 100;
        System.out.println(++a); //a=101
        System.out.println(a);  //a=101

        int b = 100;
        System.out.println(--b); //b=99
        System.out.println(b);   //b=99

        System.out.println("==========================================");

        //POST; keeps current value first, then it changes

        int A = 100;
        System.out.println(A++);
        System.out.println(A);

        int B = 100;
        System.out.println(B--);
        System.out.println(B);

        System.out.println("===========================================");

        double t1 = 3.5;
        double t2 = t1++;
        System.out.println(t2);
        System.out.println(t1);
        System.out.println("============================================");

        int num=35;
        System.out.println(num++);//35
        System.out.println(num);//36
        System.out.println(num--);//36
        System.out.println(num);//35





    }
}
