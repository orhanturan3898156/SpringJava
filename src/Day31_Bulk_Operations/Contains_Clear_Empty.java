package Day31_Bulk_Operations;

import java.util.ArrayList;
import java.util.Collections;

public class Contains_Clear_Empty {
    public static void main(String[] args) {
        //contains(object)>>we have to pass object, not primitive. It should be string style
        //equals
        //in normal array equals(aar1,arr2)


        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");

        boolean r1 = list1.contains("Z");
        System.out.println(r1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");

        boolean r2 = list1.equals(list2);
        System.out.println(r2);


        System.out.println("=================================================================");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(10);
        list3.add(100);
        list3.add(1000);
        list3.add(20);

        Collections.sort(list3);
        System.out.println(list3);

        ArrayList<Integer> reversed = new ArrayList<>();


        for (int i = list3.size() - 1; i >= 0; i--) {
            //System.out.print(list3.get(i)+ " "); ////

            reversed.add(list3.get(i));


        }
        System.out.println(reversed);
        list3 = reversed;
        System.out.println(list3);
        System.out.println("=================================================================");
        System.out.println(list3.size());
        list3.clear();//removes everything
        boolean r4=list3.isEmpty(); //checks if it is empty or not
        System.out.println(r4);


    }

}
