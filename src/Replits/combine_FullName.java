package Replits;

import java.util.Arrays;

public class combine_FullName {
    public static String[] combineNames(String[] first_names, String[] last_names) {
        String[] arr = new String[first_names.length];
        for (int i = 0; i < first_names.length; i++) {
            arr[i] = first_names[i] + " " + last_names[i];

        }


        return arr;


    }

    public static void main(String[] args) {
        //feel free to test code here
        String[] first_names = {"bob", "joe"};
        String[] last_names = {"jones", "smith"};

        String[] arr = combineNames(first_names, last_names);
        System.out.println(Arrays.toString(arr));

    }
}
