package Office_Hours.Practice_03_18_2020;

public class ShortHandOperators_Practice {
    public static void main(String[] args) {
        //+= , -= , *= ,  /=
        int a = 100;
        //a=a+200;
        a += 200;
        System.out.println(a);
        a += 200 * 3;
        System.out.println(a);
        System.out.println("===================================");

        a -= 400;
        System.out.println(a);
        System.out.println("===================================");
        int x = 5;
        x *= 3;
        System.out.println(x);
        x *= 2 + 1;
        System.out.println(x);
        System.out.println("====================================");
        int n = 900;
        n /= 3;
        System.out.println(n);
        n /= 3 * 5;
        System.out.println(n);
        System.out.println("=====================================");

        int m = 10;
        m %= 3;
        System.out.println(m);
        m %= 3;
        System.out.println(m);


    }

}
