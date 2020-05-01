package Replits;

import java.util.ArrayList;

public class Replit183 {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(100);


    }

    public static int sum(ArrayList<Integer> ints) {
        int sum = 0;
        for (int i = 0; i < ints.size(); i++) {

            sum += ints.get(i);
        }
        return sum;
    }


}
