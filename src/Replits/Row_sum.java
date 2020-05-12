package Replits;

public class Row_sum {
    public static void main(String[] args) {
        int[][] a = {
                {1, 1, 2}, //sum = 4
                {3, 1, 2}, //sum = 6
                {3, 5, 3}, //sum = 11
                {0, 1, 10}//sum = 3
        };
        int[] sums = rowSums(a);
        for (int sum : sums)
            System.out.println(sum);
//this should print 4 6 11 3
    }

    public static int[] rowSums(int[][] nums) {
        int[] arr = new int[nums.length];


        //int sumof1 = 0;
        for (int i = 0; i < nums.length; i++) {
            int sumof1 = 0;
            for (int j = 0; j < nums[i].length; j++) {
                sumof1 += nums[i][j];
            }
            arr[i] = sumof1;
        }


        return arr;
    }
}

