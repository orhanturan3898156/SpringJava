package Day6_Shorthand_LogicalOperators_IfStatement;
public class ShortHandOperators {
    public static void main(String[] args) {
        int x = 20;
        x += 10;
        System.out.println(x);

        x += 60;
        System.out.println(x);
        System.out.println("==============================================");

        String schoolName = "CyberTek";
        schoolName += 12345;
        System.out.println(schoolName);
        System.out.println("================================================");

        System.out.println('a' + 'b');
        char ch1 = 'a';
        ch1 += 'b';
        System.out.println(ch1);

        int num = 'z';
        num += 'x';
        System.out.println(num);
        System.out.println("=========================================");

        System.out.println(3 + 5);
        System.out.println('3' + '5');
        System.out.println("3" + "5");
        System.out.println((3) + (5));
        System.out.println((3 + 5));
        System.out.println((3) + 5);
        System.out.println('3' + 5);
        System.out.println("============================================");

        int A = 100;
        A -= 90;
        System.out.println(A);
        int B = 200;
        B -= A;
        System.out.println(B);
        System.out.println("==========================================");

        int a = 2;
        a *= 3;
        System.out.println(a);
        int b = a *= 10;
        System.out.println(b);
        System.out.println(a);


        int a1 = 100;
        int b1 = (a1 *= 2) + ++a1; // 200 + 201
        System.out.println(b1);


        int x1 = 10;
        int y = x1 += 10 * 2;
        System.out.println(y);

        int q = 20;
        int p = q *= 20 * 3;
        System.out.println(p);

        System.out.println("========================================");

        int num1 = 300;
        num1 /= 2; //150
        System.out.println(num1);

        int num2 = 400;
        num2 /= 20 + 10;
        System.out.println(num2);
        System.out.println("==========================================");

        int num3 = 300;
        num3 %= 10 + 20;
        System.out.println(num3);


    }
}
