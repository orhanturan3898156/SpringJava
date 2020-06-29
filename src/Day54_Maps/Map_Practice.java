package Day54_Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Practice {

    public static void main(String[] args) {

        Map<String, LocalDate> friends=new LinkedHashMap<>();
        friends.put("Ahmet",LocalDate.of(2000,3,5));
        System.out.println(friends);


    }
}
