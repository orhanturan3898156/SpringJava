package Day49_Polymorphisim;

/*
     Polymorphisim: object's behave in different forms

     - occurs when parent class/interface reference to child class' object.

     Normally:
          Dog dog1=new Dog();
     In  Polymorphisim:
          Animal dog1=new Dog();

      mainly, super class can be reference to subclass.
      sub class can never be the reference type of super class.
     */
class Animal extends Robot {

}

class Dog extends Animal { //if we make this class abstract, below class will give compile error. beacuse we cannot create object .

}

class Cat extends Animal {

}

class Robot {

}

public class Polymorphism_Intro {
    //pre-condition of polymorphisim is "there has to be 'is relation'."
    public static void main(String[] args) {
        //Animal obj = new Animal();
        Animal obj2 = new Dog();
        Animal obj3 = new Cat(); //it can be Dog(); as well.

        //Dog obj4=new Cat(); error
        Dog obj5 = new Dog();
        Cat obj6 = new Cat();


        //String[] animalshow={obj2,obj3,obj5,obj6}; it is not string
        //Dog[] animalshow={obj2,obj3,obj5,obj6}; only dog related objects fine, others error.

        Animal[] animalshow = {obj2, obj3, obj5, obj6}; //this compile perfectly.


        Robot obj7 = new Robot();

        //Animal[] animals={obj5,obj6,obj7}; obj7 not

        Robot obj8 = new Animal();
        Robot obj9 = new Dog();
        Robot obj10 = new Cat();


    }
}


