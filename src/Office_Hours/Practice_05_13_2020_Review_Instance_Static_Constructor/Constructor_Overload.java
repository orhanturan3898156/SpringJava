package Office_Hours.Practice_05_13_2020_Review_Instance_Static_Constructor;

public class Constructor_Overload {
    public Constructor_Overload(){
        System.out.println("default constructor");
    }
    public Constructor_Overload(int a){ //same name but different parameter
        System.out.println("constructor with int parameter");
    }
    public Constructor_Overload(int a , double b){
        System.out.println("constructor with int and double parameters");
    }

    public static void main(String[] args) {
        Constructor_Overload obj=new Constructor_Overload(123);

        Constructor_Overload obj2=new Constructor_Overload(123,5);
    }
}
