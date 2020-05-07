package Office_Hours.Practice_05_06_2020_CustomClass;

public class AppleINC {

    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setTesterInfo("Onur", "Junior Tester", 75000, 1245);

        Tester tester2 = new Tester();
        tester2.setTesterInfo("John", "Junior Tester", 10000, 123421);

        Tester tester3 = new Tester();
        tester3.setTesterInfo("Rahman", "SDET", 12000, 323412);


        ScrumTeam scrum1 = new ScrumTeam();
        scrum1.hireTester(tester3);
        scrum1.hireTester(tester1);
        scrum1.hireTester(tester2);

        scrum1.fireTester(1245);

        //  scrum1.testersTeam //returns testersTeam Arraylist from scrum1

        for (Tester each : scrum1.testersTeam) {
            System.out.println(each);
        }
        System.out.println("=================================================");

        Developer dev1 = new Developer();
        dev1.setTesterInfo("Barzy", "Senior Developer", 200000, 32790);

        Developer dev2 = new Developer();
        dev2.setTesterInfo("Emrah", "Developer", 130000, 45267);


        scrum1.hireDeveloper(dev1);
        scrum1.hireDeveloper(dev2);

        scrum1.fireDeveloper(32790);

        System.out.println(scrum1.developersTeam.size());

        for (Developer each : scrum1.developersTeam) {
            System.out.println(each);
        }


        System.out.println("=================================================");

        System.out.println("In scrum team, " + scrum1.testersTeam.size() + " tester and "
                + scrum1.developersTeam.size() + " developers");


    }
}
