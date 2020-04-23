package Day26_Method_Overloading;

public class Method_Overloading3 {
    /*
    first method: can find the sum of two int numbers
    second method: can find the sum of two double numbers

    >>>RETURN TYPE is not supposed to be same.does not matter
    >>>BUT parameter is matter

     */
    public static void main(String[] args) {

        sum(10, 20);
        sum(1.5, 2.5);
        double num1 = sum(10, 14.5);
        System.out.println(num1);

        double num2=sum(25L,30L);
        System.out.println(num2);


    }

    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static double sum(double a, double b) {
        return a + b;
    }
}
