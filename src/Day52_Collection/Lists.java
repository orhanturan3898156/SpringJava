package Day52_Collection;

import Day36_Static_Block.Static_Block;

import java.util.*;

public class Lists {
    public static void main(String[] args) {

        //List<String> list=new List<String>(); NOT

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);//singly

        List<Integer> list2 = new LinkedList<>();
        list2.add(10);
        list2.remove(0);

        System.out.println("=================================================");

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);


        Vector<Integer> vector = new Vector<>();
        vector.add(10);

        Stack<Integer> stack = new Stack<>();
        stack.add(10);


        System.out.println("=================================================");
        Stack<String> names = new Stack<>();
        names.add("Sha");
        names.add("Devran");
        names.add("Rahman");
        names.add("Anna");
        names.add("Rustem");

        System.out.println(names);

        String s1=names.pop();
        System.out.println(s1);
        System.out.println(names);

        String s2=names.pop();
        System.out.println(s2);
        System.out.println(names);



    }
}
