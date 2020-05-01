package Day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Warm_Up2_Dublicates2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A", "B", "A", "C", "D", "B"));

        ArrayList<String> result = new ArrayList<>();

        for (String each : list) {

            int count = Collections.frequency(list, each);

            if (count > 1 && !result.contains(each)) {
                result.add(each);
            }

        }


        System.out.println(result);

        System.out.println("====================================================================");

        ArrayList<String> result2 = new ArrayList<>();

        for (int i = 0; i <list.size() ; i++) {


            int count2 = Collections.frequency(list, list.get(i));
            if (count2 > 1 && !result2.contains(list.get(i))) {
                result2.add(list.get(i));
            }
        }
        System.out.println(result2);


    }
}
