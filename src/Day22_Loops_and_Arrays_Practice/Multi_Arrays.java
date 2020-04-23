package Day22_Loops_and_Arrays_Practice;

import java.util.Arrays;

public class Multi_Arrays {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        System.out.println(arr[1]); //2
        System.out.println(Arrays.toString(arr));//[1, 2, 3]


        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}};

        System.out.println(Arrays.toString(arr2D[0]));//[1, 2, 3]
        System.out.println(arr2D[0][2]); //3

        System.out.println(Arrays.toString(arr2D[1]));


        for (int each : arr2D[0]) {
            System.out.println(each);
        }

        for (int i = 0; i < arr2D.length; i++) {
            int num = arr2D[0][i];
            System.out.println(num);
        }


    }
}
