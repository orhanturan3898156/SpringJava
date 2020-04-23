package Day20_Arrays;

public class Array_Size {
    public static void main(String[] args) {
        //size of Array cannot change

        int[] nums=new int[2];   //default is 0 and 0
        nums[0]=10;
        nums[1]=20;
        System.out.println(nums[0]);
        System.out.println(nums[1]);

        nums=new int[3]; //it will reset the values.
        System.out.println(nums[0]);
        System.out.println(nums[1]);



    }
}
