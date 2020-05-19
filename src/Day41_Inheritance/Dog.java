package Day41_Inheritance;

public class Dog extends Animal { //extends Animal will help us to retrive all variable in "animal" class.
    //that means you don't need to write them again.
    /*
    we inherit all these below info from Animal class.

    public String name;
    public String size;
    public double weight;


    public void eat() {
        System.out.println(name + " is eating");
    }

    public void move() {
        System.out.println(name + " is moving");
    }
     */
    public void bark(){
        System.out.println(name+" is barking");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();

        dog1.name = "Lucy";
        System.out.println(dog1.name = "Lucy");

        dog1.move();//Lucy is moving
        dog1.eat();//Lucy is eating


    }

}
