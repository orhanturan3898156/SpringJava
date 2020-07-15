package Day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Method {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(7);
        list1.add(8);
        System.out.println(list1);

        list1.add(1, 6);

        System.out.println(list1);


        /*
        set(index,element): replaces the original one with new one
         */

        list1.set(3, 9);
        System.out.println(list1);

        System.out.println("==================================================================");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);

        int a = 1;

        list3.remove(a);

        System.out.println(list3);
        System.out.println("==================================================================");

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(10);
        list4.add(20);
        list4.add(30);
        int b = 1;
        list4.remove(b);
        list4.remove(1);
        System.out.println(list4);


    }
}
