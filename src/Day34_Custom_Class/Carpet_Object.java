package Day34_Custom_Class;

import java.util.ArrayList;
import java.util.Arrays;

public class Carpet_Object {
    public static void main(String[] args) {

        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};

        carpets[0].customOrder(7, 8.5, 20, true);
        carpets[1].customOrder(10, 15, 30, false);
        carpets[2].customOrder(9, 20, 15, true);
        carpets[3].customOrder(20, 18, 25, false);
        carpets[4].customOrder(35, 45, 35, true);


        System.out.println(carpets[0]); //to be able to execute this , we need to initiate toString method
        System.out.println(carpets[1]);
        System.out.println(carpets[2]);
        System.out.println(carpets[3]);
        System.out.println(carpets[4]);
        System.out.println("===============================================");

        ArrayList<Carpet> persionCarpets = new ArrayList<>();
        for (Carpet each : carpets) {
            if (each.isPersion) {
                persionCarpets.add(each);
            }
        }

        System.out.println("There are " + persionCarpets.size() + " persion carpets");

        System.out.println(persionCarpets.get(0).calcCost());
        System.out.println(persionCarpets.get(1).calcCost());

        System.out.println("===============================================");

       ArrayList<Carpet> regularCarpets = new ArrayList<>(Arrays.asList(carpets));
       /*
        for (Carpet each : carpets) {
            if (!each.isPersion) {
                persionCarpets.add(each);
            }
        }
        System.out.println(regularCarpets.size());

        */
       regularCarpets.removeIf(p ->p.isPersion);
        System.out.println("There are "+regularCarpets.size()+" regular carpets");

        for (int i = 0; i <regularCarpets.size() ; i++) {
            System.out.println(regularCarpets.get(i).calcCost());
        }





    }
}
