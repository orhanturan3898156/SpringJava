package Day7_If_Statement_Else;

public class Median_Number {
    public static void main(String[] args) {
        double a = 32;
        double b = 23;
        double c = 45;

        boolean aMedian = (a > b && a < c) || (a > c && a < b);
        boolean bMedian = (b > a && b < c) || (b > c && b < a);
        boolean cMedian = (c > a && c < b) || (c > b && c < a);

        if (aMedian) {
            System.out.println("a is median");
        }
        if (bMedian) {
            System.out.println("b is median");
        }
        if (cMedian) {
            System.out.println("c is median");
        }
    }
}
