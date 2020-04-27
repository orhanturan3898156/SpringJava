package Resources;

import java.util.Scanner;

public class selfnew {
    public static void main(String[] args) {


        fibinnaci(9);


    }

    public static void fibinnaci(int number) {


        //1 2 3 4 5 6  7 8 9
        //0,1,1,2,3,5,8,13,21,34  34= 21 -13
        int[] fib = new int[number + 1];
        fib[0] = 0;
        fib[1] = 1;


        for (int i = 2; i <= number; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];


        }
        System.out.println(fib[number]);


    }


}
