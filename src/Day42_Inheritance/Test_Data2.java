package Day42_Inheritance;

public class Test_Data2 extends Access_Modifiers {
    //sub class            super class
    //public and protected can be always inherited in the same package.

    public static void main(String[] args) {
        System.out.println(Test_Data2.publicVariable);
        System.out.println(Test_Data2.protectedVariable);
        System.out.println(Test_Data2.defaultVariable);
        //we cannot call private here

       Test_Data2.publicMethod();
       Test_Data2.protectedMethod();
       Test_Data2.defaultMethod();
       //Test_Data2.privateMethod()  we cannot call private method here


    }

}
