package Day22_Loops_and_Arrays_Practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Nested_Loop {
    public static void main(String[] args) {

        //    index       0   1     0   1   2     0   1    2   3
        char[][] arr2D = {{'A', 'B'}, {'C', 'D', 'E'}, {'F', 'J', 'H', 'I'}};
        //    INDEX        0            1             1


        for (int i = 0; i < arr2D[0].length; i++) {
            System.out.println(arr2D[0][i]); //if you print "System.out.println(arr2D[i])>>you get all of them
        }

        for (int i = 0; i < arr2D[1].length; i++) {
            System.out.println(arr2D[1][i]);
        }

        for (int i = 0; i < arr2D[2].length; i++) {
            System.out.println(arr2D[2][i]);

        }

        System.out.println("\n=======================================\n");

        for (int j = 0; j < arr2D.length; j++) {


            for (int i = 0; i < arr2D[j].length; i++) {
                System.out.println(arr2D[j][i]);

            }

        }


    }
}
