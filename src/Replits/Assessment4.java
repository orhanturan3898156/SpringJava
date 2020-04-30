package Replits;

import java.util.Arrays;

public class Assessment4 {
    public static void main(String[] args) {

        int[] numbers={1,3,2,5,0};

        boolean result=isSort(numbers);
        System.out.println(result);



    }

    public static boolean isSort(int[] nums) {

    int[] arr=new int[nums.length];

        for (int i = 0; i <nums.length ; i++) {
            arr[i]=nums[i];
        }

        Arrays.sort(nums);

        boolean result=Arrays.equals(nums,arr);
        return result;


    }


}
