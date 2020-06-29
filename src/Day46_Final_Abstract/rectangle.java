package Day46_Final_Abstract;

public class rectangle extends Shape {

    public double width;
    public double length;

    public rectangle(double width, double length) {//construcror
        this.width = width;
        this.length = length;
    }

    @Override
    public void Area() {
        double area = width * length;
        System.out.println("Area of Rectangle: " + area);
    }

}
