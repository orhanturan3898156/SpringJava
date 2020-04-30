package Day31_Bulk_Operations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_Add_All {
    public static void main(String[] args) {


        ArrayList<Integer> list1 = new ArrayList<>();
        //add 30,20,40,50,45,35,200
        list1.addAll(Arrays.asList(20, 30, 40, 50));
        System.out.println(list1);

        Integer[] nums = {300, 400, 500}; //int doesnt work INTEGER only.. because Arrays.aslist only accepts collection type>>does not primitives
        list1.addAll(Arrays.asList(nums));

        System.out.println(list1);

        System.out.println("===================================================================");

        String[] names = {"Murtaza", "Muhtar", "Mohesong", "Sada", "Rustem"};
        // names[5]="Osman";  you can not add it

        ArrayList<String> name = new ArrayList<>();
        name.addAll(Arrays.asList(names));
        name.add("Osman");
        name.remove("Muhtar");
        System.out.println(name);

        System.out.println("===================================================================");

        Integer[] numbers={1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> numList=new ArrayList<>(Arrays.asList(numbers));
        System.out.println(numList);


    }
}
