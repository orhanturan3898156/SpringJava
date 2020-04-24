package Day8_Multi_Branch_If_Statement;

public class Multi_Branch_IfStatement_ElseIf {
    public static void main(String[] args) {
        int a = 0;

        boolean positive = a > 0;
        boolean negative = a < 0;
        boolean zero = a == 0;

        if (positive) {
            System.out.println("pos");
        } else if (negative) {
            System.out.println("neg");
        } else { //you use "else"only when there is no posibility left.
            System.out.println("zero");
        }
    }
}
