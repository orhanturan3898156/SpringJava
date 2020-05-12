package Replits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays_frontPeice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt(); //3
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE

        ArrayList<Integer> list = new ArrayList<>();
        if (num.length >= 2) {
            list.add(num[0]);
            list.add(num[1]);
            System.out.println(list);

        } else {
            list.add(num[0]);
            System.out.println(list);
        }


       /*
       int[] arr = new int[2];
        if (num.length >= 2) {
            arr[0] = num[0];
            arr[1] = num[1];
            System.out.println(Arrays.toString(arr));

        } else {
            System.out.println(Arrays.toString(num));
        }

        */


    }
}
