package Day34_Custom_Class;

public class Dog {
    String breed;
    String size;
    int age;
    String color;
    String name;
    public void setDogInfo(String breed,String size,int age, String color,String name){

        this.breed=breed;
        this.size=size;
        this.age=age;
        this.color=color;
        this.name=name;


    }

    public void eating(String dogFood){
        System.out.println(name+" is eating "+dogFood);
    }
    public void sleep(){
        System.out.println(name+" is sleeping.");
    }
    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }
    public  void playing(String toy){
        System.out.println(name+" is playing "+toy);
    }
    public String toString(){
        return  "\nDog Name: "+name+ " Breed is: "+breed+
                ", size is: "+size+ " age is: "+age +" ,color is:"+color;
    }
    public void studying(String study){
        System.out.println(name+ " is studying "+ study);
    }
}
