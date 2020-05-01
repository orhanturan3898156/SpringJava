package Replits;

import java.util.ArrayList;

public class Replit190 {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(-34);
        numbers.add(3);
        numbers.add(4);
        numbers.add(-3);

        ArrayList<Integer> result = appenPosSum(numbers);
        System.out.println(result);


    }

    public static ArrayList<Integer> appenPosSum(ArrayList<Integer> abc) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int count=0;
        for (int i = 0; i < abc.size(); i++) {
            if (abc.get(i) > 0) {
                list.add(abc.get(i));
                sum += abc.get(i);
                count++;

            }

        }
        list.add(count,sum);

        return list;

    }


}
