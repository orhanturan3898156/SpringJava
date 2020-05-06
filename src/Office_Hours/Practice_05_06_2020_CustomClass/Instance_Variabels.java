package Office_Hours.Practice_05_06_2020_CustomClass;


public class Instance_Variabels {
        int a = 100;///instance variable

    public static void main(String[] args) {

        int a = 100; //local variable

        Instance_Variabels obj1=new Instance_Variabels();

        obj1.a=300;
        System.out.println(300);

        Instance_Variabels obj2=new Instance_Variabels();
        System.out.println(obj2.a);


    }
}
