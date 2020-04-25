package Replits;

import java.util.Arrays;
import java.util.Scanner;

public class Replit149 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(),n = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        add_to_r(arr, n);



    }


    public static void add_to_r(int[] r,int n){

        //int[] arr={1,2,3}
        // int num=4;
        //int[] newarr={1,2,3,4}

        int[] arr=new int[r.length+1];

        for (int i=0;i<r.length;i++){

            arr[i]=r[i];
        }
        arr[r.length]=n;

        System.out.println(Arrays.toString(arr));




    }
}
