package Office_Hours.Practice_05_20_2020_Inheritance_SuperKeyWord;

/*
1.at least one must be called in the subclass.
2.like this() keyword,super() keyword must be very first step
3.parent class' constructor with argument MUST be called manually in the subclass.

 */

class Test {
    public Test(int a) {
        System.out.println("A");
    }
}

public class Constructor extends Test {
    /*
    super key word:
    super():there must be inheritance relations between class. it calls the constructor from parent/super class

     */

    public Constructor() {
        // super(10) >> we do not use super key word when call constructor in another constructor.We use this() key word,.
        super(6);
        System.out.println("B");
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor();

    }


}
