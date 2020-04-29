package Office_Hours.Practice_04_29_2020;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(1, 30); //it adds not replace. make sure this ok.

        System.out.println(list);
        System.out.println(list.size());


        int num1 = list.get(2);
        System.out.println(num1);

        byte a = 100;
        //Integer b=a;


        Byte a2 = 100;
        int b2 = a2;

        System.out.println("=================================================");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        System.out.println(list2);

        list2.add(2, "E");
        System.out.println(list2);

        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }
        System.out.println();

        for (String each : list2) {
            System.out.print(each + " ");
        }
        System.out.println();
        System.out.println("=================================================");

        list2.set(3, "F");
        System.out.println(list2);

        System.out.println("=================================================");
        //Remove(int)
        //Remove(object)
        list2.remove(0); //
        boolean r1 = list2.remove("B");
        boolean r2 = list2.remove("Z");
        System.out.println(r2);
        System.out.println(r1);
        System.out.println(list2);


        System.out.println("=================================================");
        list2.clear();
        System.out.println(list2.size()); //before clear it is 3

    }
}
