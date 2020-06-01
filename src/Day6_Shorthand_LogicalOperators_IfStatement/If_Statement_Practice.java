package Day6_Shorthand_LogicalOperators_IfStatement;

//

public class If_Statement_Practice {
    public static void main(String[] args) {

        int a = 100;
        int b = 100;
        if (a > b) {//false
            System.out.println(a + " is greater than " + b);
        }
        if (b > a) {//false
            System.out.println(b + " is greater than " + a);
        }
        if (a == b) {//true
            System.out.println(a + " is equeal to " + b);

        }
        System.out.println("======================================");
        int x = 400;
        int y = 300;
        boolean xGreater = x > y;//true
        boolean yGreater = y > x;//false
        if (xGreater) {//true
            System.out.println(x + " is greater than " + y);
        }
        if (yGreater) {//false
            System.out.println(y + " is greater than " + x);

        }
        if (xGreater == false && yGreater == false) {
            //true==false          false==false
            //false    && true ------false
            //false  &&   true---false
            System.out.println(x + " is equal to " + y);
        }

    }
}
