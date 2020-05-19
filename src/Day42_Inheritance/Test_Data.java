package Day42_Inheritance;

import Day38_Constructors.Test;

public class Test_Data extends Data {
    /*
    public,protected,default are accessible/visible.

     */
    public static void main(String[] args) {
        System.out.println(Test_Data.publicData);
        System.out.println(Test_Data.protectedData);
        System.out.println(Test_Data.defaultData);
        //private is not visible to here.
    }
}
