package Interview_Prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public class Q29_AscendingOrder_NoSort {
    public static void main(String[] args) {
        //Write a method that can sort the ArrayList in Ascending order without using the sort method
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 5, 3, 9, 4, 12, 6));

        ArrayList<Integer> result = ascendingOrder(numbers);
        System.out.println(result);



    }

    public static ArrayList<Integer> ascendingOrder(ArrayList<Integer> list) {
        //10,1,5,3,9,4,12,6


        for (int i = 0; i < list.size(); i++) {//10
            for (int j = 0; j < list.size(); j++) {
                     //1           10
                if (list.get(i) < list.get(j)) {
                    Integer temp = list.get(i);//1
                    list.set(i, list.get(j)); //1,10
                    list.set(j, temp);//6,10  --0,1
                }
            }
        }


        return list;

    }
}
