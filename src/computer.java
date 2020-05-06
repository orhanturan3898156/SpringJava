public class computer {

    String brand;
    long serialNumber;
    String color;
    double amount;
    int memory;

    public void setComputerInfo(String brand, long serialNumber, String color, double amount, int memory) {
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.color = color;
        this.amount = amount;
        this.memory = memory;


    }

    public double calculationCost() {

        double total = amount;
        if (brand.equalsIgnoreCase("Mac")) {

            if (memory > 128) {
                return total += 500;
            } else {
                return total += 250;
            }
        } else {
            if (memory > 128) {
                return total += 250;
            } else {
                return total += 100;
            }
        }


    }
    public String toString(){

        return "Brand: "+brand+", Serial Number: "+serialNumber+
                ", Color: "+color+", Memory: "+memory+", Total Cost: "+calculationCost();

    }


}
