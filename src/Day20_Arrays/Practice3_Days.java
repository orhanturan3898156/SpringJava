package Day20_Arrays;

import java.util.Scanner;

public class Practice3_Days {
    public static void main(String[] args) {

        String[] days = {"Mon", "Tue", "Wed", "Thur", "Fri", "Sat", "Sun"};

        int lastindex = days.length - 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number please");
        int number = scan.nextInt();

        int attemps = 1;


        while (number > 7 || number <= 0) {
            System.out.println("Invalid Entry");
            System.out.println("Please re-enter the number");
            number = scan.nextInt();
            attemps++;
            if (attemps == 3 && (number > 7 || number <= 0)) {
                System.out.println("Sorry!3 attemps!! ");
                System.exit(0);
            }


        }

        String result = days[number - 1];
        System.out.println(result);


    }
}
