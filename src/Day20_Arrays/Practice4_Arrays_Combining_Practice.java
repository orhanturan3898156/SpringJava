package Day20_Arrays;

import java.util.Arrays;

public class Practice4_Arrays_Combining_Practice {
    public static void main(String[] args) {

        /*
        write a program that can combine two arrays of any lenghts , and return the third array
        arr1=>{1,2,3}
        arr2=>{4,5,6,7,}

        arr3=>{1,2,3,4,5,6,7}
         */

        int[]  array1={1,2,3};
        int[]  array2={4,5,6,7};

        int[] array3=new int[array1.length+array2.length];

        for (int i=0;i<=array1.length-1;i++){//0,1,2
            array3[i]=array1[i];//1,2,3,


        }
        for (int i=0;i<array2.length;i++){
            array3[array1.length+i]=array2[i];
            /////////3 +0  =
        }


        System.out.println(Arrays.toString(array3));




    }
}
