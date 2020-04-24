package Day11_Scanner;
import java.util.Scanner;

public class Scanner_NextLine_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Your age");
        int age = scan.nextInt();
        System.out.println("Your age :" + age);
        scan.nextLine();

        System.out.println("Your Full Name");
        String fullName = scan.nextLine();
        System.out.println("Your full name: " + fullName);


    }
}
