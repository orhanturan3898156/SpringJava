package Day21_Arrays;

public class Multi_Dimensional_Arrays1_ScrumTeam {
    public static void main(String[] args) {

        String[] devTeam = {"Zeynep", "Haider", "David", "Muhtar"};

        String[] testers = {"Rahman", "Aishan", "Osman", "Ali"};

        String[] testerteam2={"Ilhan","Zarina","Aizhan","Asuman"};

        String[] PO = {"Barzy", "Donald"};

        String[][] scrumteam = {devTeam, testers, PO};
        System.out.println(scrumteam[1]);


        System.out.println("\n================================\n");


        scrumteam[0][3] = "Orhan";
        System.out.println(scrumteam[0][3]);


        String info = scrumteam[1][2];
        System.out.println(info);

        System.out.println("\n================================\n");

        for (String eachemployee : scrumteam[1]) {
            System.out.println(eachemployee);

        }
        System.out.println("\n================================\n");

        System.out.println(scrumteam[2][1]);

        System.out.println("\n================================\n");






    }
}
