package Day37_Constructor;

public class Car_Object {
    public static void main(String[] args) {
        Car car1=new Car("Mercedes","ESE",2020,50_000);
        System.out.println(car1);
        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.price);

        System.out.println("===========================");
        Car car2=new Car("Honda","Civic",2005,10000);
        System.out.println(car2);
    }
}
