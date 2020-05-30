package Day41_Inheritance;

public class Fish extends Animal {

    public void swim() {
        System.out.println(name + " is swimming");
    }


    public static void main(String[] args) {
        Fish obj1 = new Fish();

        obj1.name = "Momo";
        obj1.weight = 5;
        obj1.size = "small";
        obj1.move();
        obj1.eat();
        System.out.println(obj1.name = "Momo");

        obj1.swim();


    }
}
