package Day21_Arrays;

import java.util.Arrays;

public class Multi_Dimensional_Arrays3_Deep_to_String {
    public static void main(String[] args) {
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}};

        //Arrays.toString() >>>is for only single array
        //Arrays.deeptoString()>>>we will use this

        System.out.println(Arrays.toString(arr2D));
        System.out.println(Arrays.deepToString(arr2D));

        System.out.println("\n================================\n");

        int[][][] arr3D={  {{1, 2, 3}, {4, 5, 6, 7}} ,{{7,8,9},{10,11,12}} };

        System.out.println(Arrays.deepToString(arr3D));

        System.out.println(arr3D[1][1][2]);

    }
}
