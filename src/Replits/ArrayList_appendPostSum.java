package Replits;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_appendPostSum {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<>(Arrays.asList(1,2,3,-9,-2));

       // appendPosSum(numbers);






    }
    public static ArrayList appendPosSum(ArrayList<Integer> list){
        ArrayList<Integer> list1=new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            list1.add(list.get(i));
        }


        list1.removeIf(p-> p<0);

        int sum=0;
        for (int i = 0; i <list1.size() ; i++) {
            sum+=list1.get(i);
        }

        list1.add(sum);

        return list;


    }



}

