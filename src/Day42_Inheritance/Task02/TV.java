package Day42_Inheritance.Task02;

public class TV extends Device {
    /*
    brand,
    model,
    price,
    country,
    Type
    size
    setDevice()
    toString >>> these all have been inherited automaticly.



    watch()

     */

    public TV(String brand, String model, double price, String size) {

        setDevice(brand,model,price,"TV",size);


    }

    public void watch(){
        System.out.println("I am watching "+ brand+" TV.");
    }



}
