package Day46_Final_Abstract;
/*
    Final: constant, cannot be changed
    Can be applied to 3 things;
    1- Variable
    When you give to variable , it cannot be reassigned again.

    2- methods: implantation of the method
    when we have final, we cannot override them
l
    3-Class: it is used for immutable, cannot be inherited.


    Local, Instance and static variable

     */


public class Final_Variable {


    final int instanceVariable = 300;
    //final int instanceVariable2=100; //we have to initialize the instance variable immediately. It is not like Local Variable.


    final static int staticVariable = 1000;
    // final static int staticVariable2;//e have to initialize the static variable immediately. It is not like Local Variable.


    public static void main(String[] args) {

        final double PI = 3.14; //normally, if we dont give final keyword we can reassign the PI.
        //  PI=3.15;

        final String gender = "male";
        //gender="Female";


        final int score; // we have not initialized it yet
        score = 100;//initialized here. We can initialized only ONCE.
        //score=200; because we have final key word, we can not assign anything else.
        System.out.println(score);

        System.out.println("====================================================");

        //let's look into instance variable now. We can call instance variable we need to create an OBJECT first.

        Final_Variable obj = new Final_Variable();
        // obj.instanceVaiable=400; giving compile error
        System.out.println(obj.instanceVariable);

        // staticVariable=2000;// when there is no final key word, we can reassign the static variable.BUT when it has final, we can't.


    }
}
