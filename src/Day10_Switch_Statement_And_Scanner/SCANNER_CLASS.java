package Day10_Switch_Statement_And_Scanner;

import java.util.Scanner;

public class SCANNER_CLASS {
    public static void main(String[] args) {
        //it helps us to get user inputs
        //java.util -->its package
        //Scanner variable=new Scanner(System.in)
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int num1=input.nextInt();
        System.out.println("you have entered"+ num1);
        if (num1%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }




    }
}
