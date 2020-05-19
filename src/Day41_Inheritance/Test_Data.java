package Day41_Inheritance;

import Day41_Inheritance.Data;

public class Test_Data extends Data {
    public static void main(String[] args) {
        System.out.println(Data.a);
        Data.method1();
/*
        System.out.println(Test_Data.a);
        Test_Data.method1()

        we cannot call these two.beace it is not inherited.
 */
//if we extends Data
        System.out.println(Test_Data.a);
        Test_Data.method1();

    }
}
