package Day50_Polymorphism;

public final class Dog extends Animal {
    /*
     3. create subclass of Animal named Dog
            variable: dogName
            methods: bark
     */
    public String dogName;

    public Dog(String dogName, int age, String gender) {
        this.dogName = dogName;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println("Dog " + dogName + " is eating");
    }

    public void sleep() {
        System.out.println("Dog " + dogName + " is sleeping");
    }

    public void bark() {
        System.out.println("Dog " + dogName + " is barking");
    }


}
