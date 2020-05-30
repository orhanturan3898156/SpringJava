package Day43_Method_Overriden.Shape;

public class ShapeObject {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        System.out.println(circle1.radius);

        circle1.calculateArea(); //PI*r*r
        circle1.calculatePerimeter();

        System.out.println("===========================================");

        Rectangle rec1 = new Rectangle(3, 2);
        System.out.println(rec1.length);
        System.out.println(rec1.width);

        rec1.calculateArea(); // W*L
        rec1.calculatePerimeter();

        System.out.println("===========================================");

        Square sq1 = new Square(4); //side*side
        System.out.println(sq1.side);

        sq1.calculateArea();
        sq1.calculatePerimeter();


    }
}
