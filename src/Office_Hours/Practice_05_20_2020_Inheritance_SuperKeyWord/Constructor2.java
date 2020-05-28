package Office_Hours.Practice_05_20_2020_Inheritance_SuperKeyWord;

class test {

    public test(String str) {
        System.out.println("String");
    }

    public test(int a) {
        System.out.println("int");

    }

    public test(double a) {
        System.out.println("double");
    }


}


public class Constructor2 extends test {
    /*
    public void method(){
        >>>>in any method, we cannot call constructor.
    }

     */
    public Constructor2(){
        super("Hello");
    }
    //default constructor automaticly called
    public static void main(String[] args) {
    Constructor2 obj=new Constructor2();
    }
}
