package Office_Hours.Practice_05_20_2020_Inheritance_SuperKeyWord;

class Data {
    int a = 100;

    public void method() {
        System.out.println("Hello World");
    }
}

public class SuperKeyWord extends Data {
    int a = 200;

    public void method() {
        System.out.println("Hello CyberTek");
    }

    public SuperKeyWord() {
        this.method(); //we can use "this." keyword or not. no problem.
        System.out.println(this.a);

        super.method();
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        SuperKeyWord obj = new SuperKeyWord();
    }
}
