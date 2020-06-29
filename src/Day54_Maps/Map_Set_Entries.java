package Day54_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Set_Entries {
    public static void main(String[] args) {

        LinkedHashMap<String, String> countries = new LinkedHashMap<>();
        countries.put("Tajikistan", "Dushanbe");
        countries.put("Kyrgyzstan", "Bishek");
        countries.put("East Turkistan", "Urumqi");
        countries.put("USA", "Washington,DC");
        countries.put("Pakistan", "Islamabad");

        //we will itarator key and values at the same time
        //entySet();
        /*
        Entry <Key, Value>
        getKey():returns key
        getvalue=returns value
         */
        String input = "tajikistan";
        for (Map.Entry<String, String> each : countries.entrySet()) {
            // System.out.println("Country Name: " + each.getKey() + ", City Name: " + each.getValue());
            String countyName = each.getKey();
            String cityname = each.getValue();

            if (input.equalsIgnoreCase(countyName)){
                System.out.println(cityname);
            }

        }


    }
}
