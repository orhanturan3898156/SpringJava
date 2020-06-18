package Day50_Polymorphism;
/*
Warmup tasks:
    1. cerate a class Animal
            variables: age, gender
            methods: eat, sleep
        DO NOT make abstract we need this for today's example
    2. create subclass of Animal named Cat
            variable: catName
            methods: scratch
    3. create subclass of Animal named Dog
            variable: dogName
            methods: bark
 */

public abstract class Animal { //when we make this class abstract, we cannot create an object from Animal class. But we can still use it as reference type.
    public int age;
    public String gender;

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }


    public static void methodA(){ //static method cannot be overriden.But overload
        System.out.println("Animal");
    }

}
