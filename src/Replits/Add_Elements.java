package Replits;

import java.util.ArrayList;
import java.util.Arrays;

public class Add_Elements {
    public static void main(String[] args) {

        int[] a={1,2,3,4,5};
        int[] b={6,7,8,9,0};

        int[] c=addElements(a,b);
        System.out.println(Arrays.toString(c));

    }

    public static int[] addElements(int[] ints1, int[] ints2) {

        int[] arr = new int[5];

        for (int i = 0; i < ints1.length; i++) {
            arr[i] = ints1[i] + ints2[i];
        }
        return arr;


    }

}
