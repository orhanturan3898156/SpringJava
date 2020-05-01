package Day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReplaceAll {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 5));
        list.set(4, 4000);// set() >> helps to replace only one item


        Collections.replaceAll(list, 2, 2000);
        System.out.println(list);


        System.out.println("=========================================");
        ArrayList<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("Omer","Omer","Mary","Sha","Fatih","Omer"));

        Collections.replaceAll(names,"Omer","Irina");
        System.out.println(names);

        /*
        //with set method
        names.set(0,"Irina");
        names.set(1,"Irina");
        names.set(5,"Irina");
        System.out.println(names);

         */
    }
}
