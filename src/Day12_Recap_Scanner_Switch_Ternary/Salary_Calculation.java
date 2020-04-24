package Day12_Recap_Scanner_Switch_Ternary;

import java.util.Scanner;

public class Salary_Calculation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your Salary");
        double salary=scan.nextDouble();
        scan.nextLine();
        System.out.println("enter your full name");
        String fullname=scan.nextLine();
        System.out.println("Your company");
        String compnayName=scan.nextLine();
        System.out.println("SSN Number");
        int ssn=scan.nextInt();
        scan.nextLine();
        System.out.println("Job title");
        String jobtitle=scan.nextLine();
        System.out.println(salary+"\n"+fullname+"\n"+compnayName+"\n"+ssn+"\n"+jobtitle);

    }
}
