package Interview_Prep;

import java.util.ArrayList;
import java.util.Arrays;

public class Q11_Ascending_ORder_Array {
    public static void main(String[] args) {
        /*
        Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
        Ex:
        int[] arr = {10, 9, 8, 7};
        arr = Sort(arr);         ==>{ 7, 8, 9, 10};
         */
        int[] array = {65, -9, 23 - 8, 9, -1, 5};

        int[] result = ascending(array);
        System.out.println(Arrays.toString(result));


    }

    public static int[] ascending(int[] arr) {

        Arrays.sort(arr);
        return arr;


    }

    public static void SortingArrayAsc(int[] arr) {

        ArrayList<Integer> list = new ArrayList();

        for (int each : arr) {
            list.add(each);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);

        }

    }
}
