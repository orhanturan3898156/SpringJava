package Replits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class switch_Elements {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};



    }

    public static int[] do_switch(int[] i) {

        Integer[] arr = new Integer[i.length];

        for (int j = 0; j < i.length; j++) {
            i[j] = arr[j];
        }

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        int lastIndex = list.size() - 1;
        Collections.swap(list, 0, lastIndex);

        int[] arr2=new int[list.size()];
        for (int j = 0; j <list.size() ; j++) {
            i[j]=list.get(j);
        }
return i;
    }


}
