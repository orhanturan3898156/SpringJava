package Office_Hours.Practice_04_15_2020;

import java.util.Arrays;

public class A5_Multi_Dimensional_Arrays {
    public static void main(String[] args) {


        int[] arr1D = {1, 2, 3};
//                 0 1 2    0 1 2 3
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}};
//                  0           1
// [index num of 1DArray][index num of elements]
// {4,5,6,7}:

        System.out.println(arr2D);
        System.out.println(Arrays.toString(arr2D[1]));
        //   System.out.println(Arrays.toString(arr2D[2])); //out of bound bc we only have 0 and 1 index
        System.out.println(arr2D[1][3]);//7
        System.out.println(arr2D[1][0]);


    }
}
