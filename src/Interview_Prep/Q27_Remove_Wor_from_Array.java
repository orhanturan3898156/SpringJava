package Interview_Prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Q27_Remove_Wor_from_Array {
    public static void main(String[] args) {
        //Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
        //Write a java operation to remove all the names named Ahmed
        String[] arr = {"Ahmed", "John", "Eric", "Ahmed" };
        String[] result = remove3(arr, "Ahmed");
        System.out.println(Arrays.toString(result));


    }

    public static String[] remove(String[] arr, String word) {

        List<String> list = new ArrayList<>(Arrays.asList(arr));

        list.removeAll(Arrays.asList(word));
        String[] arr2 = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr2[i] = list.get(i);
        }

        return arr2;


    }

    public static String[] remove2(String[] arr, String word) {

        List<String> list = new ArrayList<>(Arrays.asList(arr));

        list.removeIf(p -> p.equals(word));
        String[] arr2 = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr2[i] = list.get(i);
        }

        return arr2;

    }

    public static String[] remove3(String[] arr, String word) {
        List<String> list = new ArrayList<>(Arrays.asList(arr));

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String str = it.next();
            if (str.equals(word)) {
                it.remove();
            }
        }
        String[] arr2 = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr2[i] = list.get(i);
        }

        return arr2;


    }

}
