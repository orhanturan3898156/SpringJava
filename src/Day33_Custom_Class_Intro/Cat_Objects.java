package Day33_Custom_Class_Intro;

import java.util.ArrayList;
import java.util.Arrays;

public class Cat_Objects {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setCatInfo("Siemes", "white", 2, "Sasha");


        Cat cat2 = new Cat();
        cat2.setCatInfo("Scootish", "Beige", 7, "Bobo");


        Cat cat3 = new Cat();
        cat3.setCatInfo("Calico", "brown-white", 6, "Cinnamon");

        ArrayList<Cat> catList=new ArrayList<>();
        catList.addAll(Arrays.asList(cat1,cat2,cat3));

        for (int i = 0; i <catList.size() ; i++) {
            System.out.println(catList.get(i));
        }

        System.out.println("=====================================================");

        cat1.sleep();
        cat2.sleep();
        cat3.sleep();

        System.out.println("=====================================================");

        cat1.eat("lahmacun");
        cat2.eat("doner");
        cat3.eat("zukkum");

        System.out.println("=====================================================");

        cat1.drink("water");
        cat2.drink("milk");
        cat3.drink("coffee");



    }

}
