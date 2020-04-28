package Day30_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Warm_Up_2_ArrayList_Reverse {
    public static void main(String[] args) {
        /*
        2. write a program that can print the list of integers in reversed order
           ex:
           list=> {1,2,3,4,5}
           output: 5 4 3 2 1
         */

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < 6; i++) {
            list.add(i);

        }
        System.out.println(list);


        ArrayList<Integer> reversedList = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            int eachNum = list.get(i);
            reversedList.add(eachNum);
        }
        System.out.println(reversedList);


    }
}
