package Day23_Methods;

import java.util.Scanner;

public class Methods4_With_Parameter {

    /*
    parameters: any data type
    argument: an extra info that MUST be needed in order to complete the task (alcohol example)
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=scan.nextInt();

        EligibletoBuyAlcohol(age);


    }

    public static void EligibletoBuyAlcohol(int age) {
        if (age >= 21) {
            System.out.println("Eligible to buy");
        } else {
            System.out.println("not eligible");
        }

    }

}
