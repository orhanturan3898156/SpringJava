package Day18_Nested_Loop_DoWhile;

import java.util.Scanner;

public class Warm_Up2_Factorial_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        int result = 1;

        while (num >= 1) {
            result *= num;

            num--;

        }
        System.out.println(result);

    }
}
