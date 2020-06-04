import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SelfStudy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number <= 7 || number >= 1) {
            String result = (number == 1) ? "Mon" : (number == 2) ? "Tue" : (number == 3) ? "Wed" :
                    (number == 4) ? "Tues" : (number == 5) ? "Fri" : (number == 6) ? "sat" : "Sunday";
            System.out.println(result);
        } else {
            System.out.println("Invalid");
        }
    }
}
