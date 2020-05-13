package Replits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Arrays_Make_List {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();


        }
        //WRITE YOUR CODE HERE

        Integer[] arr = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        //System.out.println(Arrays.toString(arr));1
        Integer lastIndex = arr[nums.length - 1];
       // System.out.println(lastIndex);


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(arr));
        list.addAll(Arrays.asList(arr));

        //System.out.println(list.size());
        list.clear();

        for (int i = 0; i < 2 * arr.length - 1; i++) {
            list.add(0);
        }

        list.add(lastIndex);
        System.out.println(list);


    }
}
