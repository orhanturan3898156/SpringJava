package Day21_Arrays;

import java.util.Arrays;

public class Multi_Dimensional_Arrays2_Zoo {
    public static void main(String[] args) {

        String[] wildAnimal = {"Tiger", "Lion", "Monkey", "Turtle", "Crocodile"};
        String[] birds = {"Eagle", "Ducks", "Peacock", "Chicken"};

        String[][] zoo = {wildAnimal, birds};
        System.out.println(Arrays.toString(zoo[0]));

        //System.out.println(Arrays.toString(zoo[1]));

        String kfc = zoo[1][3];
        System.out.println(kfc);

        System.out.println("\n================================\n");

        for (String eachbirds : zoo[1]) {
            if (eachbirds.equalsIgnoreCase("chicken")) {
                continue;
            }
            System.out.println(eachbirds);


        }

        System.out.println("\n================================\n");

        for (String wild: zoo[0]){
            System.out.print(wild+" ");
        }


    }
}
