package Office_Hours.Practice_05_06_2020_CustomClass;

import java.util.ArrayList;

public class ScrumTeam {
    /*
    Attribute:
    ArrayList<Tester>
     ArrayList<Developer>

     Actions;
     hireTester(Tester tester): the given tester must be added in ArrayList of tester
     fireTester(ID):

     */

    ArrayList<Tester> testersTeam = new ArrayList<>();
    ArrayList<Developer> developersTeam = new ArrayList<>();

    public void hireTester(Tester tester) {
        testersTeam.add(tester);
    }

    public void fireTester(long id) {
        testersTeam.removeIf(p -> p.employeeId == id);

    }

    public void hireDeveloper(Developer developer) {
        developersTeam.add(developer);
    }

    public void fireDeveloper(long id) {
        developersTeam.removeIf(p -> p.employeeId == id);
    }


}
