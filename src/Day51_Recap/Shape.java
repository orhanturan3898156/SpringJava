package Day51_Recap;
 /*
    1. create an abstract class named Shape
            variables: name(static)
            abstract methods: calculateArea(), calculatePerimeter();
                    both methods return double
    2. create an interface named Volume
            variable: boolean hasVolume
            abstract method: calculateVolume() ==> returns double

    3. create an interface named PI
            variable: PI
            (created Volume & PI within same Java file)
     */

public abstract class Shape {


    public String name;

    public abstract double calculateArea(); //there is no common way to calculate the ARea for all Shape.
    //that's why we didn't create  body. to achieve this we need abstract.

    public abstract double calculatePerimeter();


    interface Volume {

        boolean hasVolume = true; //we have to give value immediately in Interface.

        public double calculatedVolume(); //even though we don't write abstract, it is already abstract
    }

    interface PI {
        public static final double PI = 3.14; //
    }

}

