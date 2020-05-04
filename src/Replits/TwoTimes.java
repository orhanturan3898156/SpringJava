package Replits;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoTimes {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 5, 3, 7));


        System.out.println(twice(list));


    }

    public static ArrayList<Integer> twice(ArrayList<Integer> list) {


        ArrayList<Integer> list2 = new ArrayList<>();


        for (int i = 0; i < list.size(); i++) {
            list2.add(list.get(i));//1,1,5,5
            list2.add(list.get(i));
        }

        return list2;

    }


}
