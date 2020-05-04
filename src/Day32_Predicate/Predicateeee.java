package Day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Predicateeee {
    public static void main(String[] args) {
        /*
        number %2 !=0
        Predicate<Integer> oddNumber= p->


         */
        Predicate<Integer> oddnumber = x -> x % 2 != 0; //->
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list.removeIf(oddnumber);
        System.out.println(list);


        System.out.println("====================================================");
        Predicate<Integer> lesstThanFive = p -> p < 5;
        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list2.removeIf(lesstThanFive);

        System.out.println(list2);

        System.out.println("====================================================");

        Predicate<String> startsWithM = s -> s.startsWith("M"); //if you want to find ones not starts with M>>>> s.startsWith("M")

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Murtaza", "Mehmet", "Baris", "Sha", "Bilal"));
        System.out.println(names);
        names.removeIf(startsWithM);
        System.out.println(names);

        System.out.println("====================================================");

        Predicate<Character> digits = c -> Character.isDigit(c); //or c>=48 && c<=57;

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('A', 'B', '3', '4', '5', '@', '&', 'Z'));

        chars.removeIf(digits);
        System.out.println(chars);

        System.out.println("====================================================");
        ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        nums.removeIf(p -> p>5);
        System.out.println(nums);


    }
}
