package Day36_Static_Block;

import Day34_Custom_Class.Tester;

public class Static_Block2 {
    static  int a;
    static int b;
    int c;

    static Tester tester1=new Tester();

    public static void main(String[] args) {
        tester1.setTesterInfo("Jean",123,"SEDT",120000);
        System.out.println(tester1);
    }

    static {
        a=100;
        b=200;
        //c=300; static only accepts static.
        if (100>200){
            a=100;
        }else {
            b=200;
        }

        tester1.setTesterInfo("Jean",123,"SEDT",120000);
    }
}
