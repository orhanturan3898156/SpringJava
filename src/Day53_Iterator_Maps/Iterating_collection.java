package Day53_Iterator_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterating_collection {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5));
        //let's remove the all numbers less than 4
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 4) {
                //continue;
                list.remove(i);
            }

        }
        System.out.println(list); //[1, 2, 3, 4, 4, 5, 5] we couldn't

        System.out.println("================================================");

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5));

        list2.removeIf(p -> p < 4); //removeIf is using iterator interface.that's why it works.
        System.out.println(list2);

        System.out.println("================================================");

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5));

        Iterator<Integer> it = list3.iterator();

        // System.out.println(it.hasNext());
        // System.out.println(it.next());//if hasNext() not true NExt doesn't work.

        while (it.hasNext()) {
            if (it.next() < 4) {
                it.remove();
            }
        }
        System.out.println(list3);

        System.out.println("================================================");

        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5));

        for (Iterator<Integer> I=list4.iterator();I.hasNext();){
            int num=I.next();
            if (num< 4) {
                I.remove();
            }
        }
        System.out.println(list4);

    }
}
