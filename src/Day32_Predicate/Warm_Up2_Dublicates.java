package Day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class Warm_Up2_Dublicates {
    public static void main(String[] args) {
        /*
        write a program that can return the duplicated values from an ArrayList of String
           Ex:
          list: {"A", "B", "A", "C", "D"};
          output: ["A"]
          list: {"A", "B", "B", "C", "D", "D"};
          output: ["A", "C"]
         */

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A", "B", "A", "C", "D"));
        System.out.println(list);
        ArrayList<String> dublicates = new ArrayList<>();


        for (int i = 0; i < list.size(); i++) {


            int count = 0;
            for (String each : list) {
                if (each.equals(list.get(i))) {
                    count++;
                }
            }
            if (count > 1 && !dublicates.contains(list.get(i))) {
                dublicates.add(list.get(i));
            }

        }
        System.out.println(dublicates);


    }
}
