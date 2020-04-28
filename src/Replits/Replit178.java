package Replits;

import java.util.Arrays;

public class Replit178 {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={4,5,6};


        int[]  arr=new int[a.length+b.length];

        for (int i=0;i<a.length;i++){
            arr[i]=a[i];
        }

        for (int j =0; j <b.length ; j++) {
            arr[j+a.length]=b[j];

        }
        System.out.println(Arrays.toString(arr));



    }

}
