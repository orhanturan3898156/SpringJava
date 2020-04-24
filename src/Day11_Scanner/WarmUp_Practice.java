package Day11_Scanner;

import java.util.Scanner;

public class WarmUp_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Your Salary");
        double salary = scan.nextDouble();
        double federalTax = salary * 0.073;
        double stateTax = salary * 0.041;
        double netIncome = salary - (federalTax + stateTax);
        System.out.println("Your net income is : " + netIncome);
    }
}
