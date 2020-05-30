package Day43_Method_Overriden.Shape;

public class Rectangle extends Shape {
    /*
    area,perimeter,
    calculateArea() and calculatePerimeter() are inherited.
     */
    public double length;
    public double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void calculateArea() {
        area = width * length;
        System.out.println("Area of the rectangle: " + area);
    }

    // we overrided the calculatePerimeter() from shape class
    public void calculatePerimeter() {
        perimeter = 2 * (width + length);
        System.out.println("Perimeter of the tectangle: " + perimeter);
    }

}
