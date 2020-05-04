package Day33_Custom_Class_Intro;

public class Car_Objects {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.brand = "BMW";
        car1.model = "X5";
        car1.year = 2020;
        car1.color = "White";


        System.out.println(car1.brand); //instance variables are object variables,we can call them through the object name
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);

        car1.start();
        car1.drive();
        car1.getCarInfo();

        System.out.println("=========================================================================");


        Car car2 = new Car();

        car2.brand = "Toyota";
        car2.model = "Camry";
        car2.year = 1893;
        car2.color = "red";

        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.color);

        car2.start();
        car2.drive();
        car2.getCarInfo();

        System.out.println("=========================================================================");

        Car car3=new Car();
        car3.brand = "Mercedes";
        car3.model = "C Class";
        car3.year = 2020;
        car3.color = "Black";
        car3.getCarInfo();
        car3.start();
        car3.drive();


        System.out.println("=========================================================================");

        String str="A";
        String str2="B";
        String[] arr={str,str2};

        Car[] cars={car1,car2,car3};
        cars[0].getCarInfo();
        cars[2].getCarInfo();









    }
}
