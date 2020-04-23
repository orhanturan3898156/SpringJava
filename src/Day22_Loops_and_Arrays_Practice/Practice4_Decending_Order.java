package Day22_Loops_and_Arrays_Practice;


import java.util.Arrays;

public class Practice4_Decending_Order {
    public static void main(String[] args) {

        /*
        write a program that sort the array in descending order

         */
        int[] arr = {10, 78, 2, -1, 500, 70};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] reversedarr = new int[arr.length];

        int j = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            reversedarr[i] = arr[j];

            j--;
        }
        System.out.println(Arrays.toString(reversedarr));


    }
}
