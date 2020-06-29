package Day52_Collection;

import java.util.*;

public class sets {

    public static void main(String[] args) {

        Set<String> names = new LinkedHashSet<>(); //
        /*
        LinkedHashSet<>(): keeps the insertion order as it is
        HashSet<>(): not in insertion order
         */

        names.add("Sha");
        names.add("Zuura");
        names.add("Saban");
        names.add("Ozgur");
        names.add("Ozgur");
        names.add("Ozgur");
        names.add("Ozgur");

        System.out.println(names);


        String[] arr = {"A", "A", "C", "B", "A"}; //ACB after remove duplicates

        LinkedHashSet set1 = new LinkedHashSet<>(Arrays.asList(arr));

        System.out.println(set1);
        //System.out.println(set1.get(1)); set doesnot have index number..no duplicate accepted.


        System.out.println("=======================================================");

        Set<Integer> numbers = new TreeSet<>();//remove duplicate and sort at the same time.

        numbers.addAll(Arrays.asList(10, 9, 10, 9, 8, 7, 8, 5, 5, 6, 7, 2, 1));

        System.out.println(numbers); //will return [1, 2, 5, 6, 7, 8, 9, 10]

        System.out.println("=================================================");

        TreeSet<String> treeSet = new TreeSet<>();
       // treeSet.add(null);//return NullPointerException

        System.out.println(treeSet);


    }
}
