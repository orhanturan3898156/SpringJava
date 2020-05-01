package Day31_Bulk_Operations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_Retain_All {
    public static void main(String[] args) {

        //oppsite of remove. it means keep matching objects.

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5));

        list.retainAll(Arrays.asList(1, 2, 3));
        System.out.println(list);


    }
}
