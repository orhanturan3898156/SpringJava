package Day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Swap {
    public static void main(String[] args) {
        /*

         */
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Collections.swap(list,1,4);;
        System.out.println(list);

    }
}
