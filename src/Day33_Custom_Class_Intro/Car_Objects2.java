package Day33_Custom_Class_Intro;

import java.util.ArrayList;
import java.util.Arrays;

public class Car_Objects2 {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setCarInfo("BMW", "X5", 2020, "White");
        car1.getCarInfo();

        Car car2 = new Car();
        car2.setCarInfo("Ferrari", "ABC", 2001, "Red");
        car2.getCarInfo();

        Car car3=new Car();
        car3.setCarInfo("Toyota","Camry",2016,"White");
        car1.getCarInfo();

        System.out.println("======================================================================");

        Car[] cars={car1,car2,car3};

        for (int i = 0; i <cars.length ; i++) {
            cars[i].getCarInfo();
        }
        System.out.println("======================================================================");
        for (Car each:cars){
            each.getCarInfo();
        }
        System.out.println("======================================================================");
        System.out.println(car1); //for this you needed to assign a method toString>>check Car class.






    }
}
