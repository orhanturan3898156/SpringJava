package Office_Hours.Practice_06_03_2020_Array_ArrayList_SAIM;

import java.util.ArrayList;

public class Practice1 {
    /*
   1_ Create a method that accept an int array and return the of all the numbers in the array

   2_ Overload the method to accept ArrayList of integers and return the sum of all the numbers int he given ArrayList
     */
    public static void main(String[] args) {

        int[] list = {1, 2, 3, 4, 5};

        int result = sumElements(list);

        System.out.println(result);


    }

    public static int sumElements(int[] arr) {
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;


    }

    public static int sumElements(ArrayList<Integer> arr) {
        int result = 0;

        for (int i = 0; i < arr.size(); i++) {
            result += arr.get(i);
        }
        return result;


    }
}