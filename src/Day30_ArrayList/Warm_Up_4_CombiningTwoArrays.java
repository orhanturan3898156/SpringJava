package Day30_ArrayList;

import java.util.ArrayList;

public class Warm_Up_4_CombiningTwoArrays {
    public static void main(String[] args) {

     /*

          5. write a program that can combine two String arrays into one arrayList
             ex:
             arr1 = {"A", "B", "C"};
             arr2 = {"D", "E", "F", "G"};
             list ==> {"A", "B", "C", "D", "E", "F", "G"}
     */

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};


        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            String eachElement = arr1[i];
            list.add(arr1[i]);

        }
        //System.out.println(list);

        for (String eachElement : arr2) {
            list.add(eachElement);
        }
        System.out.println(list);

    }


}
