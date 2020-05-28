package Office_Hours.Practice_05_20_2020_Inheritance_SuperKeyWord;

public class House {
    public static void main(String[] args) {
        /*
        Dog dog1 = new Dog();
        dog1.setInfo("Karabas",5,"white","Large","Husky");
        System.out.println(dog1);

        This is how we can do without constructor
         */
        // now we can do with constructor

        Dog dog1=new Dog("Karabas",5,"white","Large","Husky");
        System.out.println(dog1);

        Dog dog2=new Dog("Rindik",3,"Black","medium","Kangal");
        System.out.println(dog2);
        dog2.bark();

        System.out.println("=============================================================");


       /*
       This is how we can do without constructor
       Cat cat1=new Cat();
        cat1.setInfo("Efra",1,"white","small","persian");
        System.out.println(cat1);

        */
        Cat cat1=new Cat("Efra",1,"white","small","persian");
        System.out.println(cat1);
        cat1.scratch();

        System.out.println("=============================================================");

        Bunny bunny1=new Bunny("Buggy",4,"brawn","small","tiny");
        System.out.println(bunny1);
        bunny1.dig();

    }
}
