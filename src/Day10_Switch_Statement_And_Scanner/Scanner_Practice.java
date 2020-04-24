package Day10_Switch_Statement_And_Scanner;

import java.util.Scanner;

public class Scanner_Practice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Your Salary");
        int salary=input.nextInt();
        System.out.println("How many hours do you work per week?");
        int hour=input.nextInt();
        System.out.println("how many weeks do you work in a year");
        byte numberofweeks=input.nextByte();

        int rate=((salary/numberofweeks)/hour);
        System.out.println("your hourly rate is "+ rate);





    }
}
