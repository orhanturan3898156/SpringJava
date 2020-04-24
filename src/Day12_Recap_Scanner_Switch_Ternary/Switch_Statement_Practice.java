package Day12_Recap_Scanner_Switch_Ternary;

import java.util.Scanner;

public class Switch_Statement_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Case Number");
        int num = scan.nextInt();
        switch (num) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            case 3:
                System.out.println("Case 3");
                break;
            default:
                System.out.println("Invalid");

        }
    }

}
