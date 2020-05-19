package Day42_Inheritance.Task02;

public class Device_Objects {
    public static void main(String[] args) {
        TV tv1=new TV("Samsung","ABC",5000,"52 inches");
        tv1.country="USA";

        System.out.println(tv1);

        System.out.println("====================================");

        Phone phone1=new Phone("Apple","11MAX",15000,"7 Inch");
        System.out.println(phone1);
    }
}
