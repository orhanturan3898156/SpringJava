package Day41_Inheritance;

public class Animal {
    public String name; //the reason we made them public to be able to use them everywhere.
    public String size;
    public double weight;


    public void eat() {
        System.out.println(name + " is eating");
    }

    public void move() {
        System.out.println(name + " is moving");
    }
}
