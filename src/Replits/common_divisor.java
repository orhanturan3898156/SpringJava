package Replits;

public class common_divisor {
    public static void main(String[] args) {
        System.out.println(commonDivisor(15, 25)); //5
        System.out.println(commonDivisor(40, 124)); //4
        System.out.println(commonDivisor(120, 60)); //60
        System.out.println(commonDivisor(80, 60)); //20
    }


    public static int commonDivisor(int m, int n) {
        //WRITE YOUR CODE HERE
        int result = 1;
        if (m > n) {
            for (int i = 1; i <= m; i++) {
                if (m % i == 0 && n % i == 0) {
                    result = i;
                }
            }

        } else {
            for (int i = 1; i <= n; i++) {
                if (m % i == 0 && n % i == 0) {
                    result = i;

                }
            }

        }
        return result;


    }
}
