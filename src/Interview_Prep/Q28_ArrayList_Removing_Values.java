package Interview_Prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Q28_ArrayList_Removing_Values {

    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));
        removingValue2(numbers);



    }

    public static void removingValue(ArrayList<Integer> list) {

        list.removeIf(p -> p > 100);
        System.out.println(list);

    }

    public static void removingValue2(ArrayList<Integer> list){
        Iterator<Integer> it=list.iterator();
        while (it.hasNext()){
            int num=it.next();
            if (num>100){
                it.remove();
            }
        }

        System.out.println(list);
    }
}
