package Office_Hours.Practice_05_27_2020;
/*
Method overriding:



 */
public class methodOverriding {
    public void method1() {
        System.out.println("Super class");
    }

    //     @Override    >>>>this annotation helps us to check if it is overridden or not.
    public void method1(int a) {


    }
}

class Test extends methodOverriding {
    @Override
    public void method1() {
        System.out.println("Sub class");
    }

    public static void main(String[] args) {
        methodOverriding obj=new methodOverriding();
        obj.method1();


        Test obj2=new Test();
        obj2.method1();

    }

}