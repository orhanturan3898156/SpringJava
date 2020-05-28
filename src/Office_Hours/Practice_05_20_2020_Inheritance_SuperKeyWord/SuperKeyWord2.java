package Office_Hours.Practice_05_20_2020_Inheritance_SuperKeyWord;
import Day42_Inheritance.Test_Data2;

class TestData{
    int num = 100;
    String name = "Cybertek";

    public void method(){
        System.out.println("Cybertek School");
    }

}

class SuperKeyword2 extends TestData {

    int num = 200;
    String name = "MIT";

    public void method(){
        System.out.println("MIT School");
    }

    public SuperKeyword2(){
        super.method();  // Cybertek School
        System.out.println( this.num ); // 200
        System.out.println( super.name ); // "Cybertek
    }

    public static void main(String[] args) {
        SuperKeyword2 obj = new SuperKeyword2();


    }




}
