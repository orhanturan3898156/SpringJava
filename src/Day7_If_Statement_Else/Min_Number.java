package Day7_If_Statement_Else;


public class Min_Number {
    public static void main(String[] args) {
        double a = 34;
        double b = 2;
        double c = 12;

        boolean aMin = a < b && a < c;
        boolean bMin = b < a && b < c;
        boolean cMin = c < a && c < b;
        if (aMin) {
            System.out.println(a + " is the minimum number");
        }
        if (bMin) {
            System.out.println(b + " is the minimum number");
        }
        if (!aMin && !bMin) {
            System.out.println(c + " is the minimum number");
        }
    }
}
