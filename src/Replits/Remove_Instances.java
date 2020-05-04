package Replits;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Instances {
    public static void main(String[] args) {

        ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(1,1,2,3,1,4,1));
        System.out.println(removeInstances(list2,1));




    }

    public static ArrayList<Integer> removeInstances(ArrayList<Integer>list, Integer a){

        list.removeAll(Arrays.asList(a));
        return list;




    }

}
