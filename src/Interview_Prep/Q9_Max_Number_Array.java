package Interview_Prep;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Q9_Max_Number_Array {
    //Write a method that can find the maximum number from an int Array
    public static void main(String[] args) {

        int[] arr1 = {1, 56, -4, 5, 2, 7, -78};
        int result = maxNumber2(arr1);
        System.out.println(result);

    }

    public static int maxnumber1(int[] arr) {
        int max = arr[0];
        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;

    }

    public static int maxNumber2(int arr[]) {
        Arrays.sort(arr);
        int lastIndex = arr.length - 1;
        return arr[lastIndex];

    }



}
