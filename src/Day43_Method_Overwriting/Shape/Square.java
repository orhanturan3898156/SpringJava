package Day43_Method_Overwriting.Shape;

public class Square extends Shape {
    public double side;
    /*
    area,perimeter,
    calculateArea() and calculatePerimeter() are inherited.
     */


    public Square(double side) {
        this.side = side;
    }

    public void calculateArea() {
        area = side * side;
        System.out.println("Area of the circle: " + area);
    }

    // we overrided the calculatePerimeter() from shape class
    public void calculatePerimeter() {
        perimeter = 4 * side;
        System.out.println("Perimeter of the circle: " + perimeter);
    }

}
