package Office_Hours.Practice_04_15_2020;

import java.util.Arrays;

public class A1_Single_Dimensional_Arrays {
    public static void main(String[] args) {

        int[] arr = {100, 200, 300};
        System.out.println(arr[1]);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        System.out.println("\n===================\n");

        int j = 0;
        while (j < arr.length) {
            System.out.print(arr[j] + " ");
            j++;
        }
        System.out.println("\n===================\n");


        String[] names = {"James", "Aaron", "Luis"};

       /* for (int i = 0; i <= names.length; i++) {

        }
        System.out.println(Arrays.toString(names));

        String[] reversed=new String[names.length];

        int k=names.length-1;

        for (int i=0;i<names.length;i++){
            reversed[i]=names[k];
            k--;


        }
        System.out.println(Arrays.toString(reversed));*/


        String[] reversed = new String[names.length];

        int i = 0;
        int k = names.length - 1;

        while (i < names.length) {
            reversed[i] = names[k];
            i++;
            k--;
        }
        System.out.println(Arrays.toString(reversed));


    }

}
