package Day20_Arrays;

import java.util.Scanner;

public class Practice2_Months {
    public static void main(String[] args) {
        String[] months = {"Jan", "Feb", "March", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};

       /* String[] months2=new String[12];
        months2[0]="Jan";
        months2[1]="Feb"*/

        int lastindex = months.length - 1;
        // System.out.println(lastindex);  //1

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();

        int attemps=0;

        while (num > 12 || num <= 0) {
            System.out.println("Invalid Entry");
            System.out.println("Please re-enter the number");
            num = scan.nextInt();
            attemps++;

            if (attemps==2 && (num > 12 || num <= 0)){
                System.out.println("Sorry!Bye");
                System.exit(0);
            }

        }

        String result = months[num - 1];
        System.out.println(result);


    }
}
