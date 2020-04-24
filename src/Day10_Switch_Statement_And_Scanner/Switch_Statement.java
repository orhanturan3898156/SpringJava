package Day10_Switch_Statement_And_Scanner;

public class Switch_Statement {
    public static void main(String[] args) {
        //switch statement cannot be boolean,double,float,long-->others will work
        //byte,short,int work.
        int a=4;

        switch (a) {    //whatever you give for switch statement must be mathced with case values
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("none");
                break;
        }

    }
}
