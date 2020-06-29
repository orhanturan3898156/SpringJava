package Day53_Iterator_Maps;

import java.util.*;

public class Iterating_collection2 {

    public static void main(String[] args) {

        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Mehmet", "Mohammed", "Yucel", "Sha", "Ozgur", "Ahmet", "Osman", "Ozgur", "Ozgur", "Ozgur", "Irina"));

        System.out.println(names);//[Mehmet, Mohammed, Yucel, Sha, Ozgur, Ahmet, Osman, Irina]
        /*
        names.removeIf(p->p.startsWith("m") || p.startsWith("M"));
        System.out.println(names);

        */

        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String str = it.next();
            if (str.toLowerCase().contains("m")) { //or startsWith("m") || p.startsWith("M")
                it.remove();
            }
        }
        System.out.println(names);

        System.out.println("============================================================");

        LinkedHashSet<String> students = new LinkedHashSet<>();
        students.addAll(Arrays.asList("Mehmet", "Mohammed", "Yucel", "Sha", "Ozgur", "Ahmet", "Osman", "Ozgur", "Ozgur", "Ozgur", "Irina"));

        for (Iterator<String> I = students.iterator(); I.hasNext(); ) {
            String s = I.next();
            if (s.toLowerCase().contains("m")) {
                I.remove();
            }

        }
        System.out.println(students);

        System.out.println("============================================================");

        LinkedHashSet<String> T = new LinkedHashSet<>();
        T.addAll(Arrays.asList("Mehmet", "Mohammed", "Yucel", "Sha", "Ozgur", "Ahmet", "Osman", "Ozgur", "Ozgur", "Ozgur", "Irina"));

        /*
        T.removeAll(Arrays.asList("Mehmet","Ozgur","Mohammed"));
        System.out.println(T); //[Yucel, Sha, Ahmet, Osman, Irina]

        */
        T.retainAll(Arrays.asList("Yucel", "Sha")); //it will keep the name we want
        System.out.println(T); //[Yucel, Sha]


        System.out.println("============================================================");

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7));

        // verify 5, 6, 9, 8 are contained in the list
        boolean result = list.containsAll(Arrays.asList(5, 6, 9,  8, 11)); // false

        System.out.println(list.containsAll(Arrays.asList(5, 6, 9, 8, 11)));
        System.out.println(result);

    }
}
