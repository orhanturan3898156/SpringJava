package Interview_Prep;

public class Q23_Prime_Number {
    public static void main(String[] args) {

        //Write a method that can check if a number is prime or not


        primeNumber(23);


    }

    public static void primeNumber(int n) {

        if (n <= 1) {
            System.out.println(false);
        }

        // Check from 2 to n-1
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println(false);
                System.exit(0);

            }
        }
        for (int i = 2; i < n; i++) {
            if (n % i != 0) {
                System.out.println(true);
                break;
            }
        }

    }


}