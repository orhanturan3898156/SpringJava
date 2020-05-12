package Replits;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arrays_Diving {
    public static void main(String[] args) {
        /*
        In the sport of diving, seven judges award a score between 0 and 10,
         where each score may be a floating-point value.

         The highest and lowest scores are thrown out, and the remaining scores are added together.
         The sum is then multiplied by the degree of difficulty for that dive.
         The degree of difficulty ranges from 1.2 to 3.8 points.
         The total is then multiplied by 0.6 to determine the divers score.
         */
        //WRITE YOUR CODES HERE

        Scanner scan = new Scanner(System.in);
        ArrayList<Float> scores = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < 7; i++) {
            System.out.println("Enter score");

            scores.add(scan.nextFloat());

        }
        Collections.sort(scores);
        scores.remove(0);
        scores.remove(5);

        double total = 0;

        for (int i = 0; i < 5; i++) {
            total += scores.get(i);
        }
        //System.out.println(total);
        System.out.println("Diffuculty");
        double diffuculty = scan.nextDouble();
        total = total * diffuculty;

        total = (total * 0.6);


        // FINAL OUTPUT
        System.out.printf("Total: %.2f", total);
    }
}
