package Office_Hours.Practice_05_13_2020_Review_Instance_Static_Constructor;

public class InstanceTest {
    public static void main(String[] args) {
        Instances obj1=new Instances();
        obj1.name="Muhtar";

        Instances obj2=new Instances();
        obj2.name="Ahmet";

        System.out.println(obj1.name);
        System.out.println(obj2.name);

        obj1.printName();
        obj2.printName();


    }
}

class InstanceBlock{

    public static void main(String[] args) {
        Instances obj=new Instances();
        System.out.println(obj.name);
    }


}
