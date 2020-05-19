package Day42_Inheritance.Task01;

public class Person {
    /*
    Attributes: name, age, gender
    Methods;eat, walk, sleep,setPersonInfo
     */

    public String name;
    public int age;
    public char gender;

    public void setPersonInfo(String name, int age, char gender) { //this is not constructor, but a method.
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void walk() {
        System.out.println(name + " is walking");

    }

    public void slepp() {
        System.out.println(name + " is sleeping");
    }

    public void drink(String drink) {
        System.out.println(name + " is drinking " + drink);
    }


}
