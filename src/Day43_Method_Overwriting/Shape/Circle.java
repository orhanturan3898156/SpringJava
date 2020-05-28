package Day43_Method_Overwriting.Shape;

public class Circle extends Shape {
    /*
    area,perimeter,
    calculateArea() and calculatePerimeter() are inherited.
     */

    public double radius;
    public static double PI = 3.14;

    // we overrided the calculateArea() from shape class
    public void calculateArea() {
        area = radius * radius * PI;
        System.out.println("Area of the circle: " + area);
    }

    // we overrided the calculatePerimeter() from shape class
    public void calculatePerimeter() {
        perimeter = radius * 2 * PI;
        System.out.println("Perimeter of the circle: " + perimeter);
    }


    public Circle(double radius) {
        this.radius = radius;
    }
}
