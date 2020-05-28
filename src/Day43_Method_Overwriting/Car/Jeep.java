package Day43_Method_Overwriting.Car;

public class Jeep extends Car {
    void start() {
        System.out.println("call mechanic");
        System.out.println("oil change");
        System.out.println("Jump start");
    }
}
