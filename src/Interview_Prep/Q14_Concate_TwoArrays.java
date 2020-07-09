package Interview_Prep;

import java.util.Arrays;

public class Q14_Concate_TwoArrays {
    public static void main(String[] args) {
        //Write a return method that can concate two arrays

        int[] arr1={1,2,3,10};
        int[] arr2={4,5,6,7};

        int[] result=concateArryas(arr1,arr2);
        System.out.println(Arrays.toString(result));


    }

    public static int[] concateArryas(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {

            arr3[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length+i] = arr2[i];
        }

        return arr3;


    }


}
