package Day48_Abstraction;

public class iPhone extends Phone {

    static {
        brand = "Iphone"; //>>>with this static block,it helps us to execute only one time.
    }

    public iPhone(String model, double price, String size) {
        //brand = "Iphone";
        this.model = model;
        this.price = price;
        this.size = size;
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Iphone is calling " + phoneNumber);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Iphone texting " + phoneNumber);
    }

    public void faceTiming(long phoneNumber) {
        System.out.println("Facetime with " + phoneNumber);
    }
}
