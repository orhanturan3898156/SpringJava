package Office_Hours.Practice_04_29_2020;

import java.util.ArrayList;

public class ArrayList_Methods2 {
    public static void main(String[] args) {
        //indexOf(object)>> returns index number

        ArrayList<Character> list1 = new ArrayList<>();
        list1.add('A');
        list1.add('B');
        list1.add('C');
        list1.add('D');
        list1.add('E');
        list1.add('C');


        System.out.println(list1.indexOf('C'));
        System.out.println(list1.lastIndexOf('C'));
        System.out.println("===============================");

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9};

        ArrayList<Integer> arr3 = new ArrayList<>();
      /*  for (int i=0;i<arr1.length;i++){
            arr3.add(arr1[i]);
        }

        for (int i=0;i<arr2.length;i++){
            arr3.add(arr2[i]);
        }
        System.out.println(arr3);*/

        for (int each : arr1) {
            arr3.add(each);
        }

        for (int each : arr2) {
            arr3.add(each);
        }
        System.out.println(arr3);


    }
}
