package Day21_Arrays;

import java.util.Arrays;

public class Multi_Dimensional_Arrays {
    public static void main(String[] args) {
        /*
        Multi-deminesional array= a variable that can contain arrays
        n dimensional array MUST contain (n-1) dimensional arrays.


         */


        int[] arr = {1, 2, 3}; //regular array>>it stores multiple data

        //  index         0  1  2     0 1  2
        int[][] arr2D = {{1, 2, 3}, {4, 5,6, 7}};
        //// index        0,           1

        System.out.println(arr2D.length);

        int[] arr1D = arr2D[0];  //{1,2,3}
        System.out.println(Arrays.toString(arr2D[1]));

        int num1= arr2D[1][3];//
        System.out.println(num1);

        System.out.println("=============================");


        char[][] ch2D={{'A','B'},{'C','D','E'}};
        System.out.println(ch2D[1]);

        System.out.println(Arrays.toString(ch2D[1]));
        System.out.println(ch2D[1][0]);


    }
}
