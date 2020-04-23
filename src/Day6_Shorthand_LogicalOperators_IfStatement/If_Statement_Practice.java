package Day6_Shorthand_LogicalOperators_IfStatement;

//

public class If_Statement_Practice {
    public static void main(String[] args) {

        int a = 100;
        int b = 100;
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        }
        if (b > a) {
            System.out.println(b + " is greater than " + a);
        }
        if (a == b) {
            System.out.println(a + " is equeal to " + b);

        }
        System.out.println("======================================");
        int x = 400;
        int y = 300;
        boolean xGreater = x > y;
        boolean yGreater = y > x;
        if (xGreater) {
            System.out.println(x + " is greater than " + y);
        }
        if (yGreater) {
            System.out.println(y + " is greater than " + x);

        }
        if (xGreater == false && yGreater == false) {
            System.out.println(x + " is equal to " + y);
        }

    }
}
