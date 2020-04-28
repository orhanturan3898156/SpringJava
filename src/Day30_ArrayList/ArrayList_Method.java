package Day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Method {
    public static void main(String[] args) {

        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(5);
        list1.add(7);
        list1.add(8);
        list1.add(3,5);
        list1.add(1,6);

        System.out.println(list1);

    }
}
