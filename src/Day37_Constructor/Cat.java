package Day37_Constructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Cat {
    String breed;
    int age;
    String color;

    public Cat(String breed, int age, String color) {
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public String toString() {
        return "Breed: " + breed +
                ", Age: " + age +
                ", Color: " + color;
    }

}

class CatObject {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Pamuk", 2, "White");
        Cat cat2 = new Cat("Ceviz", 1, "Brown");
        Cat cat3 = new Cat("Findik", 4, "Gray");

        ArrayList<Cat> listOfCats = new ArrayList<>(Arrays.asList(cat1, cat2, cat3));
        System.out.println(listOfCats.size());
        for (int i = 0; i < listOfCats.size(); i++) {
            Cat each = listOfCats.get(i);
            System.out.println(each);

        }

        listOfCats.removeIf(p -> p.age > 2);
        System.out.println(listOfCats.size());
        System.out.println(listOfCats);


    }
}
