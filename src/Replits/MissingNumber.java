package Replits;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 6, 8, 9, 10};
        int result = missingNumber(arr);
        System.out.println(result);

    }

    public static int missingNumber(int[] arr) {
        /*
         Arrays.sort(arr);
        int missing=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]!=i+1){
                missing=i+1;
                break;
            }

        }
        return missing;
         */
        Arrays.sort(arr);
        int missing=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]!=i+1){
                missing=i+1;
                break;
            }

        }
        return missing;

    }
}
