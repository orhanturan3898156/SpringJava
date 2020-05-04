package Day31_Bulk_Operations;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Dublicate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 2, 2, 3, 3));

        ArrayList<Integer> result = new ArrayList<>();//1,2,3

        for (Integer each : list) {

            if (!(result.contains(each))) {
                result.add(each);
            }


        }
        System.out.println(result);

        System.out.println("============================================");
        /*
        write a program can remove dublicate from an array
         */
        int[] arr1={1,1,2,3,2,3,4};

        ArrayList<Integer> nonDublicate=new ArrayList<>();

        for (int i = 0; i <arr1.length ; i++) {
            if (!nonDublicate.contains(arr1[i])){
                nonDublicate.add(arr1[i]);
            }
        }
        System.out.println(nonDublicate);



    }
}
