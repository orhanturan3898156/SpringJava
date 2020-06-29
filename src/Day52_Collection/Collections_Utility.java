package Day52_Collection;

import java.util.*;

public class Collections_Utility {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10, 9, 8, 7, 6, 5, 4));

        System.out.println(list1);

        Collections.sort(list1);
        System.out.println(list1);

        System.out.println("============================================");
        //write a program that remove the dublicates and print out ascending order.


        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(5, 5, 1, 1, 2, 4, 4, 4, 2, 6, 6, 4, 4, 8, 8, 8, 4, 3, 3, 2));
        /*
        TreeSet<Integer> sorted = new TreeSet<>(nums);

        nums = new ArrayList<>(sorted);

        System.out.println(sorted);

         */
        //if you don't want to declare a new variable, use below.
        nums = new ArrayList<>(new TreeSet<>(nums));


        System.out.println(nums);

        System.out.println("================================================");

        //write a program that remove the duplicates in an ArrayList. donot change the order

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(3, 3, 5, 6, 2, 7, 8, 8, 5, 3, 2));

        list = new ArrayList<>(new LinkedHashSet<>(list));

        System.out.println(list);


        System.out.println("================================================");

        ArrayList<String> letters = new ArrayList<>();
        letters.addAll(Arrays.asList("A", "A", "B", "C", "D"));

        boolean result = Collections.frequency(letters, "A") == 1;  //we can use this method, if you want to make sure if an object is occur only one time in the webpage.
        System.out.println(result);//false


    }
}
