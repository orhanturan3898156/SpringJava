package Day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class ArrayList_Practice2 {
    public static void main(String[] args) {

        /*
        1.create a list of Integers
        2.add to Integers to it
        3.return the max number
        do not use sorting

         */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(20);
        list.add(300);
        list.add(400);
        list.add(50);

        //int maximum=Integer.MIN_VALUE;
        int maximum = list.get(0);


        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > maximum) {
                maximum = list.get(i);
            }
        }
        System.out.println(maximum);

        System.out.println("=================================================");

        for (int each : list) {
            if (each > maximum) {
                maximum = each;
            }
        }
        System.out.println(maximum);

        System.out.println("=========================================");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(150);
        list2.add(300);
        list2.add(450);
        int maximum1 = max(list2);
        System.out.println(maximum1);



    }

    public static int max(ArrayList<Integer> List) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < List.size(); i++) {
            if (List.get(i) > max) {
                max = List.get(i);
            }
        }
        return max;
    }


}
