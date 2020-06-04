package Office_Hours.Practice_06_03_2020_Array_ArrayList_SAIM;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice3 {
    /*
    Create a method that will accept an ArrayList of Strings and return the string that has the biggest lenght
     */
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Ahmet", "Mehmet", "Ali", "Abdullah"));

        String result = biggest(list1);
        System.out.println(result);


    }

    public static String biggest(ArrayList<String> list) {
        // ArrayList<String> list1=new ArrayList<>(Arrays.asList("Ahmet","Mehmet","Ali"));

        String max = list.get(0);
       /*
        for (int i = 0; i <list.size() ; i++) {

            if (list.get(i).length()>max.length()){
                max=list.get(i);
            }

        }

        */
        for (String each : list) {
            if (each.length() > max.length()) {
                max = each;
            }


        }
        return max;

    }
}