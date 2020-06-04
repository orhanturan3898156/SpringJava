package Office_Hours.Practice_06_03_2020_Array_ArrayList_SAIM;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice2 {
    /*
    3_ Create a method that will accept an int array and reverse the order of elements. Return the reversed array
    $_overload the method with ArrayList

     */
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int[] arr2 = reversed(arr);
        System.out.println(Arrays.toString(arr2));


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 10, 4, 5));

        System.out.println(reversed(list));


    }

    public static int[] reversed(int[] arr) {

        int[] arr2 = new int[arr.length]; //4

        int lastIndex = arr.length - 1; //4

        for (int i = 0; i < arr.length; i++) {
            arr2[lastIndex] = arr[i];
            //0
            lastIndex--;
        }
        return arr2;


    }

    public static ArrayList<Integer> reversed(ArrayList<Integer> list) {
        ArrayList<Integer> list2 = new ArrayList<>();


        for (int i = list.size() - 1; i >= 0; i--) {
            list2.add(list.get(i));


        }
        return list2;
    }
}