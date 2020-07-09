package Interview_Prep;

import java.util.Arrays;

public class Q10_Minumum_Number_Array {
    public static void main(String[] args) {

        int[] array = {5, -9, 34, 89, 23, 9};
        int result = minNumber2(array);
        System.out.println(result);


    }

    public static int minNumber1(int arr[]) {
        int min = arr[0];
        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;

    }

    public static int minNumber2(int arr[]) {

        Arrays.sort(arr);
        int firstIndex = arr[0];

        return firstIndex;

    }

}
