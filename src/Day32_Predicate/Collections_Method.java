package Day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections_Method {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        int max = Collections.max(list);
        System.out.println(max);

        int min = Collections.min(list);
        System.out.println(min);

        System.out.println("========================================================");

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 4));

        //second max:3
        //second min:2

        Integer maxNum = Collections.max(numbers);
        numbers.removeAll(Arrays.asList(maxNum));
        System.out.println(numbers);

        int secondMax = Collections.max(numbers);
        System.out.println(secondMax);

        System.out.println("========================================================");

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 4));
        Integer minNum = Collections.min(list2);
        System.out.println(minNum);

        list2.removeAll(Arrays.asList(minNum));

        int secondMin=Collections.min(list2);
        System.out.println(secondMin);


    }


}
