package Resources;
//we have to make it sub class of Access_Modifiers,first.

import Day42_Inheritance.Access_Modifiers;

public class Inheritance2 extends Access_Modifiers {
    //          subclass             super class
    //subclass can only inherit
    //it can call public and protected. not private and default.
    //private is already clear why. default can not be called in another package.

    public static void main(String[] args) {
        System.out.println(Inheritance2.protectedVariable);
        System.out.println(Inheritance2.publicVariable);
        //default and private cannot be called.

        Inheritance2.protectedMethod();
        Inheritance2.publicMethod();
        //default and private cannot be called.


    }


}
