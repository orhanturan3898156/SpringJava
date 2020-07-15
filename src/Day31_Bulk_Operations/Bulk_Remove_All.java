package Day31_Bulk_Operations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_Remove_All {
    public static void main(String[] args) {

        //removes all matching objects


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(list);


        /*Integer a = 1; >>if you do this it will remove will only remove first one
        list.remove(a);
        System.out.println(list);*/

        list.removeAll(Arrays.asList(1, 3, 5, 8));
        System.out.println(list);

        Integer[] arr={4,6,7};
        list.removeAll(Arrays.asList(arr));
        System.out.println(list);

        System.out.println("=================================================================");
        String[] names={"Ahmet","John","Aaron","Ahmet","Daniel"};

        ArrayList<String> nameList=new ArrayList<>(Arrays.asList(names));
        System.out.println(nameList);
        nameList.removeAll(Arrays.asList("Ahmet"));
        System.out.println(nameList);


    }
}
