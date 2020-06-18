package Day50_Polymorphism;

public class AnimalObjects {
    public static void main(String[] args) {
        //Reference typ is important,because it decides what to reach.
        //Let 's say you want to reach Bark method. you can only call/access through Dog class, not animal.

        //IMPORTANT: in Polymorphism ,reference type is the one decides what can be called/accessed or not.
        //in Polymorphism, always overriden one will be executed.(method)
        /*
        If a method exists in both object type and reference type;
            -if overridden; Object Type
            -if not overridden: Reference type
         */



        /*
        WebDriver driver=new ChromeDriver();
        driver.get();

         */

        Dog obj1 = new Dog("Lucy", 3, "F");
        System.out.println(obj1.dogName);
        obj1.bark();

        Animal obj2 = new Dog("Kito", 3, "F");
        // System.out.println(obj2.dogName); We cannot call DogName variable,because dogName variable is in Dog class not Animal.
        //obj2.bark(); Cannot access

        obj2.eat(); //it returns us overridden method.Means it calls the method in Dog class.

        System.out.println("============================");
        //might be asked. good to know.

        Animal animal1 = new Cat("A", "F", 3);
        boolean isDog = animal1 instanceof Dog; //to be able to use this key word, there has to be a "is relation".

        System.out.println(isDog);

        Dog d1 = new Dog("B", 3, "M");
        //boolean r1=d1 instanceof Cat;  there is no "is relation"
        //to be able to use this key word, there has to be a "is relation".

    }
}
