package Office_Hours.Practice_05_20_2020_Inheritance_SuperKeyWord;

public class Cat extends Pet {
    /*
    Cat Variable:
    name
    age
    color
    size
    breed
    isPet
    numberOfEyes >>>>>>these are all inherited

    scratch >>> not intherited

     */

    public Cat(String name, int age, String color, String size,String breed) {
        setInfo(name, age, color, size, breed);
    }
    public void scratch(){
        System.out.println(name + " is scratching");
    }
}
