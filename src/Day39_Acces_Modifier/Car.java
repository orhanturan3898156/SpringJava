package Day39_Acces_Modifier;

public class Car {
    /*
    create a class called Car:
    instance variable:
    brand, model, year, price
    add a constructor that can initialize brand of car
    add a constructor that can initialize brand and model of the car
    (apply constructor call to initialize the brand)
     add a constructor that can initialize the brand, model, year of the car
     (apply constructor call to initialize brand, model)
     add a constructor that can initialize brand, model, year and price of the car
     (apply constructor call to initialize brand, model, year)
     add toString method
     */
    String brand;
    String model;
    int year;
    double price;

    public Car(String brand) {
        this.brand = brand;

    }

    public Car(String brand, String model) {
        // this.brand = brand; >>istead of this we call above method to assign brand.

        this(brand); //this.brand = brand;
        this.model = model;
    }

    public Car(String brand, String model, int year) {
        /*
        this.brand = brand;
        this.model = model;
        */
        this(brand, model);
        this.year = year;
    }

    public Car(String brand, String model, int year, double price) {
        /*
        this.brand = brand;
        this.model = model;
        this.year=year;
        */
        this(brand, model, year);
        this.price = price;
    }


    public String toString() {
        return "Year: " + year +
                ", Brand: " + brand +
                ", Model: " + model +
                ", Price: $" + price;

    }

}

class car_object {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota");
        System.out.println(car1);

        System.out.println("===========================================================");

        Car car2 = new Car("BMW", "X5");
        System.out.println(car2);

        System.out.println("===========================================================");

        Car car3 = new Car("Lexus", "RX", 2020);
        System.out.println(car3);

        System.out.println("===========================================================");

        Car car4 = new Car("Mercedes", "ES300", 2020, 52000);
        System.out.println(car4);

    }
}
