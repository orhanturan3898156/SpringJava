package Day54_Maps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Set_Entries {

    public static void main(String[] args) {

        Map<String, String> fb = new LinkedHashMap<>();
        fb.put("Tester01", "password1");
        fb.put("Tester02", "password1");
        fb.put("Tester02", "password2");
        fb.put("Tester03", "password3");
        fb.put("Tester04", "password4");
        fb.put("Tester05", "password5");


        System.out.println(fb);
        System.out.println(fb.get("Tester05"));

        //how to write all keys at once.

        fb.keySet();
        for (String eachKey : fb.keySet()) {
            System.out.println(eachKey +" "+fb.get(eachKey));
        }

        List<String> usernames=new ArrayList<>(fb.keySet());
        System.out.println(usernames);

        System.out.println("==================================");

        for (String eachValue:fb.values()){
            System.out.println(eachValue);
        }

        List<String> passwords=new ArrayList<>(fb.values());
        System.out.println(passwords);

        System.out.println("==================================");




    }
}
