package Office_Hours.Practice_05_13_2020_Review_Instance_Static_Constructor;

public class Instances {
    /*
    instance variables are created outside the block.
    instance method does not have "static"

     */
    String name;
/*
    {
        //this is an instance block.it belongs to object
        name="Zuura";



    }

 */
public static void main(String[] args) {
    Instances obj=new Instances();
    obj.name="Zuura";
    System.out.println(obj.name);
}

    public void printName() {
        //int name = 100;
        System.out.println("Name is: " + this.name);

    }


}
