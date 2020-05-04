package Replits;

import java.util.ArrayList;
import java.util.Arrays;

public class Delivery_Calc {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9, 1));
        System.out.println(refuel(list, 3));


    }

    public static int refuel(ArrayList<Integer> list, int a) {

        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);

        }
        if (sum % a == 0) {
            return sum / a;
        } else {
            return sum / a + 1;
        }


    }

}
