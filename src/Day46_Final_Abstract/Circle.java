package Day46_Final_Abstract;

public class Circle extends Shape {
    public double radius;
    public final static double PI = 3.14;

    @Override
    void Area() {//when override, we can give the same or more visible access modifier
        //means we can give default or public.
        double area = radius * radius * PI;
        System.out.println("Area: " + area);
    }

}
