package Interview_Prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Q12_Moving_Zero_to_End {
    public static void main(String[] args) {
        /*
        Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
        Ex:
        input:  {1,0,2,0,3,0,4,0};
        output: [1, 2, 3, 4, 0, 0, 0, 0]
         */

        int arr[] = {1, 0, 2, 0, 3, 0, 4, 0, 9, 0};

        moveZeros(arr);


    }

    public static void moveZeros(int[] arr) {


        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        int count = Collections.frequency(list, 0);

        list.removeAll(Arrays.asList(0));


        for (int i = 0; i < count; i++) {
            list.add(0);
        }
        System.out.println(list);


    }

    public static int[] moveZero2(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        int countZero = 0;

        for (int each : arr) {

            list.add(each);

            countZero += (each == 0) ? 1 : 0;

        }


        list.removeAll(Arrays.asList(0));

        arr = new int[arr.length];

        for (int i = 0; i < arr.length - countZero; i++) {

            arr[i] = list.get(i);

        }

        return arr;
    }


}
