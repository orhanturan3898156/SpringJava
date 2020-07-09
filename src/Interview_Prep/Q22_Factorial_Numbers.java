package Interview_Prep;

public class Q22_Factorial_Numbers {
    public static void main(String[] args) {

        //Write a return method that returns the factorial number of any given number

        int result=factorial(5);
        System.out.println(result);

    }


    public static int factorial(int number) {

        int sum = 1;

        for (int i = 1; i <= number; i++) {
            sum *= i;
        }
        return sum;


    }
}
