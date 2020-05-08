package Office_Hours.Practice_05_06_2020_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Developer_Object {
    public static void main(String[] args) {


        Developer developer1 = new Developer();

        developer1.setDevInfo("John", "Senior Developer", 150000, 235474745);
        System.out.println(developer1);

        System.out.println(developer1);

        Developer developer2 = new Developer();

        developer2.setDevInfo("Leon", "Senior Developer", 200000, 4534745);

        developer1.coding();
        developer2.coding();

        developer1.fixingBugs();
        developer2.fixingBugs();
        System.out.println("=================================================");

        Developer[] arr = {developer1, developer2};

        System.out.println(arr[0]);
        System.out.println(arr[0].name);
        System.out.println("=================================================");

        for (Developer each : arr) {
            System.out.println(each.name + " " + each.salary);
        }


        System.out.println("=================================================");

        ArrayList<Developer> developerList = new ArrayList<>(Arrays.asList(arr));
        //developerList.addAll(Arrays.asList(developer1, developer2));
        // System.out.println(developerList.size());

        /*
        for (int i = 0; i <developerList.size() ; i++) {
            System.out.println(  developerList.get(i).name);
        }

         */

        for (Developer each:developerList){
            System.out.println(each);
        }











    }
}
