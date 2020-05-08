import java.util.ArrayList;
import java.util.Arrays;

public class bank {
    public static void main(String[] args) {

        customer customer1 = new customer();
        customer1.setCustomerInfo("John", 750, 45000, true, 19);

        customer customer2 = new customer();
        customer2.setCustomerInfo("Alex", 850, 85000, true, 50);

        customer customer3 = new customer();
        customer3.setCustomerInfo("Mahmur", 600, 90000, false, 45);

        customer customer4 = new customer();
        customer4.setCustomerInfo("Necati", 800, 70000, true, 32);

        customer customer5 = new customer();
        customer5.setCustomerInfo("Ozgur", 705, 50000, false, 67);


        ArrayList<customer> customerlist = new ArrayList<>(Arrays.asList(customer1, customer2, customer3, customer4, customer5));

        customerlist.removeIf(p -> !p.isEmployeed || p.salary > 55000);
        System.out.println(customerlist.size());
        for (int i = 0; i < customerlist.size(); i++) {
            System.out.println(customerlist.get(i).name);
        }

        System.out.println("===================================");
        customer[] arr = {customer1, customer2, customer3, customer4, customer5};



    }
}
