package Day51_Recap;

import java.util.ArrayList;
import java.util.Arrays;

public class ShapesObjects {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(5);


        Cylinder cylinder1 = new Cylinder(3, 5);
        Cylinder cylinder2 = new Cylinder(3, 5);

        /*
        ArrayList<Circle> list=new ArrayList<>(); //when give Circle as reference, we cannot add Cylinder object to this list. and there is no "IS RELATION " between circle and cylindr.
        list.addAll(Arrays.asList(circle1,circle2));

        */
        ArrayList<Shape> list = new ArrayList<>(); //when give Circle as reference, we cannot add Cylinder object to this list. and there is no "IS RELATION " between circle and cylindr.
        list.addAll(Arrays.asList(circle1, circle2, cylinder1, cylinder2));

        //Shape shape1=(Shape)circle1;//implicitly done.
        Shape shape2 = new Cylinder(3, 6);
        //shape2.radius; Reference type doesnt' have radius, but object type has it. In this case we need downcasting
        //shape2.calculateVolume(); cannot call.need below
        ((Cylinder) shape2).calculatedVolume();

        System.out.println("=================================================");

        for (Shape eachShape:list){
            System.out.println(eachShape.name +": "+eachShape.calculateArea());
        }

        System.out.println("=================================================");

        //list.get(2).calculatedVolume(); compile error. tobe able to call "calculatedVolume();" we need downcasting.
        double d=((Cylinder)list.get(2)).calculatedVolume();
        System.out.println(d);

        System.out.println("=================================================");

        //((Cylinder)list.get(1)).calculatedVolume(); //eventough it compiles, when run gives "ClassCastException"
        //because there is no "is relation".between circle and cylinder.

        System.out.println("=================================================");

        Shape s1=new Circle(6);
       // System.out.println(s1.radius); no

        System.out.println( ((Circle)s1).radius);







    }
}
