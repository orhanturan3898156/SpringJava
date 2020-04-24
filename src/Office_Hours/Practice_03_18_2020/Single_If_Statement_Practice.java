package Office_Hours.Practice_03_18_2020;

public class Single_If_Statement_Practice {
    public static void main(String[] args) {

        int a = 300;
        int b = 200;
        boolean aGreater = a > b;
        boolean bGreater = b > a;

        if (a > b) {
            System.out.println(a + " is greater");

        }
        if (b > a) {
            System.out.println(b + " is greater");
        }
        if (a == b) {

            System.out.println("equal");
        }
        System.out.println("===============================");

        byte age = 12;
        if(age>=21){ //or age>21 || age=21

            System.out.println(" you can buy");
        }
        if (age<21){
            System.out.println("you can not buy");
        }


    }
}
