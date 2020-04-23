package Day20_Arrays;

public class Practice1_Max_Min_Number {
    public static void main(String[] args) {
        /*
        create a program that can find the maximum number given int arrat
        do not use sort method
        then minumum number

         */

        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
        int lastindex = arr.length - 1;
        //System.out.println(lastindex);

        int max = arr[0];
        int min = arr[2];

        for (int i = 0; i <= lastindex; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
            if (arr[i] < min){
                min=arr[i];
            }


        }
        System.out.println(max);
        System.out.println(min);


        //System.out.println("\n===============================\n");

        /*int min=arr[3];
        for (int i=0;i<=lastindex;i++){
            if (min>arr[i]){
                min=arr[i];
            }



        }
        System.out.println(min);*/


    }
}
