package Day24_Methods;


import java.util.Arrays;

public class Task1 {

     /*
     1-create a function that can print the maximum and minimum numbers from any given array
     2- create and array in decending order
     */


    public static void MaxNumber(int[] array) {
        Arrays.sort(array);
        System.out.println(array[array.length - 1]);
    }
    public static void MinNumber(int[] array){
        Arrays.sort(array);
        System.out.println(array[0]);
    }

    public static void main(String[] args) {
        int[] arr = {10, 8, 9, 5, 4, 3, 2, 1};
        MaxNumber(arr);
        MinNumber(arr);
    }

}
