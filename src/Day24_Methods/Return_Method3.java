package Day24_Methods;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Return_Method3 {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 200, 50, 40};
        int max = maxNumber(arr);
        System.out.println(max);
        int min = minNumber(arr);
        System.out.println(min);


    }

    public static int maxNumber(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static int minNumber(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }
}
