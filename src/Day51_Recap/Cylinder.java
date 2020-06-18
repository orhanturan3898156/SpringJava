package Day51_Recap;

public final class Cylinder extends Shape implements Shape.Volume, Shape.PI {
    /*
    5. create a final class named Cylinder that can inherit from Shape, Volume, and PI
                variables: radius, Height
                set a static block that initialize the name to "Circle"
                set a constructor that can initialize the radius and height
     */
    public double radius;
    public double height;
    public Cylinder(double radius,double height){
        this.radius=radius;
        this.height=height;
        name="Cylinder";
    }

//We actuallly could have created name in constrcutor,but it will run alot. that's why we put it in static block. by creating this static block we don't make faster


    @Override
    public double calculateArea() {
        return (PI*2*radius) +(height*PI*2*radius);
    }

    @Override
    public double calculatePerimeter() {
        return 2*(PI*radius*height);
    }

    @Override
    public double calculatedVolume() {
        return PI*radius*radius*height;
    }
}
