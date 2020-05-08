package Day35_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setInfo("VA", "BOFA", 100000, true);
        //System.out.println(offer1);

        Offer offer2 = new Offer();
        offer2.setInfo("KY", "Capital One", 120000, false);
        //System.out.println(offer2);

        Offer offer3 = new Offer();
        offer3.setInfo("MD", "Chase", 95_000, true);
        //System.out.println(offer3);

        Offer offer4 = new Offer();
        offer4.setInfo("BayArea", "Google", 115_000, false);

        Offer[] offers = {offer1, offer2, offer3, offer4};

        String myLocation = "VA";

        ArrayList<Offer> accept = new ArrayList<>(Arrays.asList(offers));
        System.out.println(accept.size()); // size = 4

       /* for (int i = 0; i <accept.size() ; i++) {
            System.out.println(accept.get(i));
        }

        */
        for (Offer each : accept) {
            System.out.println(each);
        }
        System.out.println("=========================================================");
        accept.removeIf(p -> p.salary < 100_000 || p.isFullTime == false || !p.location.equalsIgnoreCase("VA"));
        //we can write "removeIf" conditions seperately....3 of them

        for (Offer each : accept) {
            System.out.println(each);
        }

    }
}
