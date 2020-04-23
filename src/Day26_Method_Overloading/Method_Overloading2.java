package Day26_Method_Overloading;

public class Method_Overloading2 {

    /*
         1.create a method sum of two int numbers
         2.create a method sum of three int numbers
         3.create a method sum of four int numbers




     */
    public static void main(String[] args) {

        sum(3,4);
        sum(3,4,5);
        sum(3,4,5,6);

    }

    public static void sum(int a, int b){
        System.out.println(a+b);
    }
    public static void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void sum(int a, int b,int c, int d){
        System.out.println(a+b+c+d);
    }


}
