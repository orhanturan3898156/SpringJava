package Replits;

import java.util.Arrays;
import java.util.Scanner;

public class Replit151 {
    public static void main(String[] args) {

    int[] numbers={1,2,3};  //
    int num=4;

    int[] arr=new int[numbers.length+1];


    for (int i=0;i<numbers.length;i++){


        arr[i]=numbers[i];
        /*
        arr[0]=1,
        arr[1]=2
        arr[2]=3
        arr[3]=4

         */
        arr[numbers.length]=num;


    }
        System.out.println(Arrays.toString(arr));



    }







}


