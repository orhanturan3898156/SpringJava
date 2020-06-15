package Day50_Polymorphisim;

/*
2. create subclass of Animal named Cat
            variable: catName
            methods: scratch
 */
public final class Cat extends Animal {//if we want Cat class to be not parent of any other class ,we can make it final.

    //everything in Animal class inherited to Cat class since we used extends.
    //Totally, we have 3 variables and 2 methods inherited from Animal class.
    public String catName;

    public Cat(String catName, String gender, int age) {
        this.catName = catName;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println("Cat " + catName + " is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat " + catName + " is sleeping");
    }

    public void scratch() {

    }
}
