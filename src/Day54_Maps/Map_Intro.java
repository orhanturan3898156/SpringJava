package Day54_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Intro {
    public static void main(String[] args) {

        Map<String, Double> employeeInfo = new LinkedHashMap<>();
        employeeInfo.put("Zarina", 195000.0); //map doesn't accept duplicate Key value.
        employeeInfo.put("Ahmet", 180000.0);
        System.out.println(employeeInfo.size());//Size is 2
        System.out.println(employeeInfo);

        System.out.println(employeeInfo.get(0)); //gives null.
        //Map doesn't have index number. we should give the key to retrive the data

        System.out.println(employeeInfo.get("Zarina"));
        System.out.println(employeeInfo.get("Ahmet"));

        employeeInfo.remove("Zarina");

        System.out.println(employeeInfo);
        System.out.println(employeeInfo.size());// Size is 1

        employeeInfo.put("Zarina", 120000.0);

        System.out.println(employeeInfo); //It will add to list LAST ONE.


    }
}
