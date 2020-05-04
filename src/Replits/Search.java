package Replits;

import java.util.ArrayList;
import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("2", "6", "foo bar", "abc"));

        String abc = search(arr, "moo");
        System.out.println(abc);
    }

    public static String search(ArrayList<String> r, String find) {
        String result = "";
        for (int i = 0; i < r.size(); i++) {
            if (r.get(i).contains(find)) {
                result = r.get(i);
                return result;
            }
        }

        return "search failed";


    }


}
