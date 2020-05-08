package Day35_Static;

public class Static_Practice2 {


    String brand;   // we give these two because each cars have their own model and model they are nnot common,but driving is common
    String model;
    static boolean hasWheelst = true; //common for each cars


    public void printBrand() {

        System.out.println(brand);

    }

    public void printModel() {
        System.out.println(model);
    }


    public static void main(String[] args) {
        System.out.println(hasWheelst);
    }


}
