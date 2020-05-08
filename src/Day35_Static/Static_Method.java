package Day35_Static;

public class Static_Method {
    int a = 100;

    static int b = 200;


    public static void main(String[] args) {

        //System.out.println(a);>>>compile error>>>there must be object
        //static only accepts static
        Static_Method obj = new Static_Method();

        System.out.println(obj.a);
        /// this is the way you can call

        System.out.println("==========================================");

        System.out.println(b);//200 it accepts this one because it is a static variable.
        System.out.println(Static_Method.b);
        System.out.println(obj.b); //static prefers to be called through class name


    }


    public void method() {
        System.out.println(a); //you can call "a" in distance method.
        System.out.println(b); //you can call static as well.

    }
}
