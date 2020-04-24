package Day7_If_Statement_Else;
public class Max_Number {
    public static void main(String[] args) {
        double a = 30.3;
        double b = 40;
        double c = 5.1;


        if (a > b && a > c) {
            System.out.println("A is the biggest number");
        }
        if (b > a && b > c) {
            System.out.println("B is the biggest number");
        }
        if (c > a && c > b) {
            System.out.println("C is the biggest number");
        }
    }
}
