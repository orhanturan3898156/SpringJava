package Day35_Static;

public class Dog {
   String breed;
   static boolean isPet;


    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.breed="Husky";
        dog1.isPet=true;

        Dog dog2=new Dog();
        dog2.breed="Poddle";


        System.out.println(dog1.breed);
        System.out.println(dog2.breed);
        System.out.println(dog1.isPet);
        System.out.println(dog1.isPet);

        /*
        when use "String breed;" gives you Husky and Poddle
        but
        when use "static String breed;" gives you Poddle

         */







    }
}
