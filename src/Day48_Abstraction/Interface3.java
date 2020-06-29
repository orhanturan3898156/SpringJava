package Day48_Abstraction;

public interface Interface3 {

    public void method1();

    public abstract void method2();

    public static final int num = 100;
    int num2 = 300; //this is not instance,beacuse by default it has static and final words.

    public static void main(String[] args) {
        Interface3.method3();
        System.out.println(num); //since num and num2 are static , we can call them through class.
        System.out.println(Interface3.num2);

    }

    static void method3() {

    }
}
