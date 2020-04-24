package Day11_Scanner;

import java.util.Scanner;

public class Scanner_Class2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Your name");
        String name = scan.nextLine();
        System.out.println("Last Name");
        String last = scan.nextLine();
        System.out.println("Employeed or not");
        boolean employee = scan.nextBoolean();
        double salary = 0;
        if (employee == true) {
            System.out.println("Your salary");
            salary = scan.nextDouble();
        } else {
            System.out.println("No salary - unemployeed");
        }

        System.out.println(name + " " + last + " " + employee + " " + salary);
    }
}
