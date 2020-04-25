package Replits;

public class Replit151 {
    public static void main(String[] args) {

        int[] arr={1,1,2,3,4,4,5,5,7,8,9,8};
        uniqueNumbers(arr);



    }
    public static void uniqueNumbers(int[] arr){
        for (int j=0;j<arr.length;j++) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] ==arr[j]) {
                    count++;


                }
            }
            if (count == 1) {
                System.out.println(arr[j]);
            }

        }



    }
}
