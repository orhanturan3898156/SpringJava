package Day34_Custom_Class;

import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAmerica {
    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setTesterInfo("Vanera", 1234556, "Senior SDET", 150000);
        Tester tester2 = new Tester();
        tester2.setTesterInfo("Elif", 3345647, "Senior Tester", 100000);
        Tester tester3 = new Tester();
        tester3.setTesterInfo("Joe", 8768798, "Tester", 120000);
        Tester tester4 = new Tester();
        tester4.setTesterInfo("Jack", 3547475, "Senior SDET", 110000);
        Tester tester5 = new Tester();
        tester5.setTesterInfo("Ahmet", 9324127, "Senior SDET", 105000);


        ArrayList<Tester> testers = new ArrayList<>();
        testers.addAll(Arrays.asList(tester1, tester2, tester3, tester4, tester5));

        testers.removeIf(p -> !p.jobTitle.contains("SDET"));
        double totalbudget = 0;
        for (Tester each : testers) {
            System.out.println(each);
            totalbudget += each.salary;
        }
        System.out.println(totalbudget);


    }
}
