package Replits;

public class Carpet {
    public double width;
    public double length;
    public double unitPrice;
    public double totalPrice;
    public boolean isPersion;

    public Carpet() {
        width = 300;
        length = 300;
        totalPrice = 200;
        isPersion = false;
        unitPrice = 0;
    }

    public Carpet(double width, double length, double unitPrice, boolean isPersion) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersion = isPersion;
        if (isPersion) {
            //return (width + length) * unitPrice;
            totalPrice = (width + length) * unitPrice + 200;

        } else {
            totalPrice = (width + length) * unitPrice;
        }
    }


    public String toString() {
        return
                "width: " + width +
                        ", length: " + length +
                        ", unitPrice: " + unitPrice +
                        ", totalPrice: " + totalPrice +
                        ", isPersion: " + isPersion
                ;
    }

    public static void main(String[] args) {
        Carpet carpet1 = new Carpet();
        System.out.println(carpet1.totalPrice);

        Carpet carpet2 = new Carpet(20, 20, 2, true);

    }

}