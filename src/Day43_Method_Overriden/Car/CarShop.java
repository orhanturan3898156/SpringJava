package Day43_Method_Overriden.Car;

public class CarShop {
    public static void main(String[] args) {
        Tesla tesla = new Tesla();
        tesla.start();


        System.out.println("====================================");
        Honda honda = new Honda();
        honda.start();

        System.out.println("====================================");
        Jeep jeep = new Jeep();
        jeep.start();


        //overall , we created only one method with several functions.
        //each functions associated with related item.

        /*
        -reusable
        -easy to remember
        -more organize
        

         */


    }
}
