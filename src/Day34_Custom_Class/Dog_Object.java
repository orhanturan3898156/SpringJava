package Day34_Custom_Class;

import java.util.ArrayList;
import java.util.Arrays;

public class Dog_Object {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.setDogInfo("Husky", "small", 1, "yellow", "Bastie");
        System.out.println(dog1);
        /*dog1.breed="Husky";
        dog1.size="small";
        dog1.color="yellow";
        dog1.name="Bestie";
        dog1.age=1;

         */
        System.out.println(dog1.breed);
        System.out.println(dog1.size);
        System.out.println(dog1.color);
        System.out.println(dog1.name);
        System.out.println(dog1.age);

        System.out.println("======================================================");
        Dog dog2 = new Dog();
        dog2.setDogInfo("Alabay", "Extra Big", 5, "Brown", "Comar");
        Dog dog3 = new Dog();
        dog3.setDogInfo("Poodle", "miniature", 2, "white", "Sasha");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        Dog dog4 = new Dog();
        dog4.setDogInfo("Pomerian", "small", 3, "white", "Lil");
        Dog dog5 = new Dog();
        dog5.setDogInfo("Pomerian", "small", 4, "white", "Ernie");


        ArrayList<Dog> puppies = new ArrayList<>();
        puppies.addAll(Arrays.asList(dog1, dog2, dog3,dog4,dog5));
        //puppies.addAll(Arrays.asList(dog4, dog5));

        for (int i = 0; i < puppies.size(); i++) {
            Dog eachDog = puppies.get(i);
            System.out.println(eachDog);

        }

        System.out.println("======================================================");

        puppies.removeIf(p -> p.age > 2);
        System.out.println(puppies);


    }
}
