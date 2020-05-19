package Day42_Inheritance.Task02;

public class Phone extends Device{
    /*
    brand,
    model,
    price,
    country,
    Type="Phone"
    size
    setDevice()
    toString >>> these all have been inherited automaticly.

    call,
    text

     */

    public Phone(String brand, String model, double price, String size){
        setDevice(brand,model,price,"Phone",size);

    }

    public void call(long number){
        System.out.println("Calling to "+number);
    }
    public void text(long number){
        System.out.println("Texting to "+number);
    }

}
