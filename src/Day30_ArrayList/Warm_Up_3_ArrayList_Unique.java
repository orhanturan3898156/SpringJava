package Day30_ArrayList;

import java.util.ArrayList;

public class Warm_Up_3_ArrayList_Unique {
    public static void main(String[] args) {
        /*
        3. write a program that can print out the unique elements from an int array
           HINT: store all the unqie elemenbts of array into a list of integers
           Ex: array==> {1,1,2,3,3,4,5}
           output: {2,4,5}
         */


        ArrayList<Integer> list = new ArrayList<>(); //1,2,1>>>2 is unique
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);


        ArrayList<Integer> uniques = new ArrayList<>();


        for (Integer each2 : list) {
            int count = 0;
            for (Integer each : list) {
                if (each == each2) {
                    count++;
                }
            }

            if (count == 1) {
                uniques.add(each2);
            }

        }
        System.out.println(uniques);


    }
}
