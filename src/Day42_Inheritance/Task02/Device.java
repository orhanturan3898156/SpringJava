package Day42_Inheritance.Task02;

public class Device {
    /*
    attributes: brand, model, price,country, type
    method:toString


     */
    public String brand;
    public String model;
    public double price;
    public static String country = "China";
    public String type;
    public String size;


    public String toString() {
        return
                "Brand= " + brand +
                        ", Model: " + model +
                        ", Type: " + type +
                        ", Size " + size +
                        ", Price: " + price +
                        ", Made in: " + country;

    }

    public void setDevice(String brand,String model,double price,String type,String size){
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.type=type;
        this.size=size;

    }
}
