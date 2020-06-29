package Day53_Iterator_Maps;

import java.util.*;

public class Collection_Practice {
    /*
    access modifier specifier return type methodName(Parameter)
       Specifiers: static, final, abstract ,synchronized

     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        //to synchronized this, we can do below;
        list = Collections.synchronizedList(list); //it became thread safe.

        Set<Integer> set = new HashSet<>();
        set = Collections.synchronizedSet(set);

        System.out.println("==========================================================");

        String[] arr = {"E", "B", "A", "B", "A", "D", "D", "C", "A"}; //don't do any sorting onlyremove duplicate. ABCD

        LinkedHashSet<String> st = new LinkedHashSet<>(Arrays.asList());
        /* adding with loop.
        for (String each:arr) {
            st.add(each);
        }

         */ //with loop
        System.out.println(st);

        ArrayList<String> arrayList=new ArrayList<>(Arrays.asList("E", "B", "A", "B", "A", "D", "D", "C", "A"));
        LinkedHashSet<String> st2=new LinkedHashSet<>(arrayList);
        System.out.println(st2);






    }

    public synchronized void append() {

    }

}
