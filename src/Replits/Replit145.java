package Replits;

public class Replit145 {
    public static void main(String[] args) {

        /*
        Create a method called plus_minus that gets an array of ints (int[]), it outputs how many negative , positive and zero numbers are in the array.

for example:

plus_minus (new int[]{1,2,55,-9,-2,0});

will output:
positives:3, negatives:2, zeros:1
         */

        int [] arr={1,-3,4,0,0,4,5,-8,-34,23,0,67,-62};
        plus_minus(arr);






    }

        private static void plus_minus(int[] arr) {
            int positive = 0;
            int negative = 0;
            int zero = 0;

            for(int i=0;i<arr.length;i++){
            if (arr[i]>0){
                positive++;
            }else if (arr[i]<0){
                negative++;
            }else {
                zero++;
            }


            }
            System.out.println("Total of positive numbers: "+positive);
            System.out.println("Total of negative numbers: "+negative);
            System.out.println("Total of zero numbers: "+zero);
        }




}
