package Day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods2_Remove_Clear {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");

        list.add("C");
        list.add("D");


        //list.remove(1);
        String str = "B";
        list.remove(str);
        boolean r1 = list.remove("F");
        boolean r2 = list.remove("A");

        System.out.println(list);

        /*
        clear(): it remove everything. Means size will be zero 0.

         */

        list.clear();
        System.out.println(list);
        System.out.println(list.size());

        /*
        indexOf(Object)>>>returns you its index number >>returns as an int
         */

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(1);
        list2.add(2);
        list2.add(30);

        int num1=list2.indexOf(30);
        System.out.println(num1);

        int num2=list2.indexOf(100);
        System.out.println(num2); //gives -1 >>means it doesnt exist in this arraylist


    }


}
