package Office_Hours.Practice_05_13_2020_Review_Instance_Static_Constructor;

public class statics {
    int instanceVariable = 100;
    static int staticVariable = 200;

    public static void staticMethod() {
        //instanceMethod(); it doesnt accept anything other than static.

    }

    public void instanceMethod() {
        staticMethod();
        System.out.println(staticVariable);
        System.out.println(instanceVariable);
    }

    public static void main(String[] args) {

        System.out.println(staticVariable);
        // System.out.println(instanceVariable); we cannot call it beacuse it is instance and we need an object
        //instanceVariable we cannot call it beacuse it is instance and we need an object
        staticMethod();


    }
}
