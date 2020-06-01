package Day46_Final_Abstract;

public class shape_object {
    public static void main(String[] args) {
        Circle obj1 = new Circle(3.5);
        obj1.Area();

        System.out.println("====================================");

        square obj2 = new square(5);
        obj2.Area();

        System.out.println("====================================");

        rectangle obj3 = new rectangle(3, 5);
        obj3.Area();
    }
}
