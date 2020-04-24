package Office_Hours.Practice_03_18_2020;

public class UnaryOperators_Practice {
    public static void main(String[] args) {
        //post and pre increment/decrement
        int a=20;
        System.out.println(a++);
        System.out.println(a);
        System.out.println("=======================");
        int b=30;
        int c=b--; //c=30
        System.out.println(b);
        System.out.println(c);
        System.out.println("========================");

        int z=100;  //100 --101--100--99--100
        z= z++ + --z - z-- + ++z;
        //100  + 100 - 100 + 100
        System.out.println(z);

        System.out.println("=========================");

        int u=900; //901--902
        int r=- ++u + ++u + -u++;
        //     -901 + 902 + -902

        System.out.println(r);
        System.out.println(u);


    }
}
