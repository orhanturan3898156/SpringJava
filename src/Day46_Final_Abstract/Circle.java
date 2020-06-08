package Day46_Final_Abstract;

public final class Circle extends Shape {
    public double radius;
    public final static double PI = 3.14;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public void Area() {//when override, we can give the same or more visible access modifier
        //means we can give default or public.
        double area = radius * radius * PI;
        System.out.println("Area of Circle: " + area);
    }

}
