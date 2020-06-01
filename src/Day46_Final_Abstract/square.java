package Day46_Final_Abstract;

public class square extends Shape {
    public double side;
    public square(double side){
        this.side=side;
    }

    public void Area() {
        double area = side * side;

        System.out.println("Area of Square: " + area);
    }

}
