package Day22_Loops_and_Arrays_Practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Nested_Loop2 {
    public static void main(String[] args) {

        int[][] numbers = {{9, 8, 7}, {6}, {5, 4, 3, 2, 1, 0}};

        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                System.out.print(numbers[j][i] + " ");
            }
            System.out.println();

        }


        //System.out.println(Arrays.deepToString(numbers));


        for (int k=0;k<numbers.length;k++){
            for (int i=numbers[k].length-1;i>=0;i--){
                System.out.print(numbers[k][i]+" ");
            }

        }




    }
}
