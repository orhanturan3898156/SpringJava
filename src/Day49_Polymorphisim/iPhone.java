package Day49_Polymorphisim;

public  class iPhone extends Phone implements AppleApps { //the reason we make it final is any iphone infor could not be used by another one

    static {
        brand = "Apple";
    }

    public iPhone(String model, double price, String size) {
        this.model = model;
        this.price = price;
        this.size = size;
    }


    @Override
    public void download() {
        System.out.println("Iphone is downloading apps from " + AppStoreName);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Iphone is texting to: " + phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Iphone is calling to: " + phoneNumber);
    }

    public void faceTiming(long phoneNumber) {
        System.out.println("Iphone is facetiming with " + phoneNumber);
    }
}
