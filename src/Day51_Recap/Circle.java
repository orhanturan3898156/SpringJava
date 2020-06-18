package Day51_Recap;
/*
4. create a final class named circle that can inherit from Shape and PI
                variable: radius
                set a static block that initialize the name to "Circle"
                set a constructor that can initialize the radius
 */

public final class Circle extends Shape implements Shape.PI {
    public double radius;


    public Circle(double radius) {
        this.radius = radius;
        name="Circle";
    }
    //We actuallly could have created name in constrcutor,but it will run alot. that's why we put it in static block. by creating this static block we don't make faster


    @Override
    public double calculateArea() {

        return radius * radius * PI;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * radius * PI;
    }
}
