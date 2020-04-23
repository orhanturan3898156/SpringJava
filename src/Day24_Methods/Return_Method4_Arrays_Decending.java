package Day24_Methods;

import java.util.Arrays;

public class Return_Method4_Arrays_Decending {
    public static void main(String[] args) {

        int[] arr1 = {1, 10, 9, 8, 14, 15};
        int[] arr2 = {200, 100, 150, 500, 40};
        int[] arr3 = {1000, 800, 5000, 3000};


        arr1 = sortDecending(arr1);
        arr2 = sortDecending(arr2);
        arr3 = sortDecending(arr3);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));


        System.out.println(arr1[0]);


    }

    public static int[] sortDecending(int[] arr) {
        Arrays.sort(arr);
        int[] RevArr = new int[arr.length];

        int j = arr.length - 1;


        for (int i = 0; i < arr.length; i++) {
            RevArr[i] = arr[j];
            j--;
        }
        return RevArr;


    }
}
