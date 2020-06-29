package Day50_Polymorphism;

public class Reference_Type_Casting {
    /*
    Casting: is used for changing type.

    1_Primitive Casting:Implicit and explicit
    We apply these two casting to numerical primitive.
    byte < short < int < long < float < double
      -Implicit Casting:Done automatically by Java.
         Ex: int num=100;
             double num1=num;

      -Explicit Casting:must be done by user. casting larger type to smaller type. Manually.
         Ex: int a=200;
             short s=(short)a;



    2_Reference Type Casting:
    pre-condition is there must be "IS RELATION" first.
        -UpCasting:Done automatically.
        -Down Casting:
     */
    public static void main(String[] args) {

        int a = 100;
        double b = (double) a; //100.00 automatically.not require


        Dog dog = new Dog("a", 1, "m");
        Animal animal1 = (Animal) dog;//upcasting,done implicitly.


        Cat cat = new Cat("r", "f", 2);
        //Dog dog2=cat;

        Animal animal2 = (Animal) cat;
        //upcasting: casting from sub class type to superclass type
        //downcasting>>casting from superclass type to subclass type. manually.

        System.out.println("========================================================");

        double c = 10;
        int d = (int) c; //explicitly done.

        Animal animal3 = new Dog("a", 12, "m");
        Dog dog3 = (Dog) animal3;//down casting

        Animal animal4 = new Cat("c", "f", 5);
        Cat cat2 = (Cat) animal4;

        System.out.println("========================================================");
        //Benefits of downcasting\

        Animal animal5 = new Dog("Lucy", 4, "F");
        //animal5.bark(); reference type decides.so we cannot access bark method.at this point we need downcasting
        Dog dog2 = (Dog) animal5;
        dog2.bark();

        //second way-easier
        ((Dog) animal5).bark();


        //we will see this,when take screenshot, and script executer


    }
}
