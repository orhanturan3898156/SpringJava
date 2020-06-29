package Day54_Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Practice {

    public static void main(String[] args) {

        Map<String, LocalDate> classMates = new LinkedHashMap<>();
        classMates.put("Jack", LocalDate.of(2000, 3, 5));
        classMates.put("John", LocalDate.of(2000, 3, 8));
        classMates.put("Maria", LocalDate.of(1970, 7, 25));
        classMates.put("Katie", LocalDate.of(1993, 11, 13));
        classMates.put("Nicholas", LocalDate.of(2001, 8, 4));

        System.out.println(classMates);
        System.out.println(classMates.size());

        System.out.println(classMates.get("Jack"));

        classMates.remove("Maria");
        System.out.println(classMates);
        System.out.println(classMates.size());

        boolean result = classMates.containsKey("John");
        System.out.println(result);

        boolean result2 = classMates.containsValue(LocalDate.of(2001, 8, 4));
        System.out.println(result2);

        System.out.println("===========================");
        LinkedHashMap<String, Integer> students = new LinkedHashMap<>();
        students.put("Adil", 92);
        students.put("Hunar", 89);
        students.put("Barzy", 75);
        students.put("Rahman", 93);
        students.put("Hardi", 80);

        LinkedHashMap<String, Integer> badStudents = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> goodStudents = new LinkedHashMap<>();

        for (String eachKey : students.keySet()) {
            int eachValue = students.get(eachKey);
            if (eachValue < 90) {
                System.out.println(eachKey);
                badStudents.put(eachKey, eachValue);
            } else {
                goodStudents.put(eachKey, eachValue);
            }

        }
        System.out.println(goodStudents);
        System.out.println(badStudents);


    }
}
