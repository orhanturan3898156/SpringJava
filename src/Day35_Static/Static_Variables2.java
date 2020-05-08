package Day35_Static;

public class Static_Variables2 {

    int insVariable;
    static int staticVariable;    //there is only one copy of static shared by all objects.

    public static void main(String[] args) {

        Static_Variables2 obj1 = new Static_Variables2();
        obj1.insVariable = 300;
        obj1.staticVariable = 400;


        Static_Variables2 obj2 = new Static_Variables2();


        System.out.println(obj1.insVariable);//300
        System.out.println(obj2.insVariable);//0

        System.out.println();

        System.out.println(obj1.staticVariable);

        System.out.println("================================");

        System.out.println(Static_Variables2.staticVariable); //static can be called through class name

        // System.out.println(staticVariable.insVariable);  instance CANNOT be called through class name>>object can be called here












    }
}
