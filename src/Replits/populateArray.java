package Replits;
/*
populate method accepts an empty int array and populates it with numbers counting up.

for example:

populate(new int[3])
returns:[1,2,3]

populate(new int[5])
returns:[1,2,3,4,5]

hint:
use a for loop and use the iterator as the current elements value.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class populateArray {
    public static int[] populate(int[] r)
    {
        int[] list=new int[r.length];

        for (int i = 0; i <r.length ; i++) {
           list[i]=i+1;//
        }
        return list;


    }

    public static void main(String[] args)
    {


        int [] arr= new int[8];
        arr= populate(arr) ;
        System.out.println(Arrays.toString(arr));

    }
}
