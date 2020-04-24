package Day12_Recap_Scanner_Switch_Ternary;
import java.util.Scanner;

public class Sum_Of_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 Positive number");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();
        double num4 = scan.nextDouble();
        double num5 = scan.nextDouble();
        double sumofNumbers = 0;

        if (num1 > 0) {
            sumofNumbers += num1;
        }
        if (num2 > 0) {
            sumofNumbers += num2;
        }
        if (num3 > 0) {
            sumofNumbers += num3;
        }
        if (num4 > 0) {
            sumofNumbers += num4;
        }
        if (num5 > 0) {
            sumofNumbers += num5;
        }
        System.out.println("Total is " + sumofNumbers);
    }
}
