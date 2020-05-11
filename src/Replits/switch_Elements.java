package Replits;

import java.util.Arrays;

public class switch_Elements {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4};

        int[] reversed=do_switch(numbers);
        System.out.println(Arrays.toString(reversed));





    }
    public static int[] do_switch(int[] i){
        int[] arr = new int[i.length];
        int a = i.length - 1;
        for (int j = 0; j < i.length; j++) {
            arr[j] = i[a];
            a--;

        }

        return arr;


    }



}
