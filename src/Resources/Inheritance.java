package Resources;

import Day42_Inheritance.Data;

public class Inheritance extends Data {
              //sub              super

    public static void main(String[] args) {
        System.out.println(Inheritance.protectedData);
        System.out.println(Inheritance.publicData);

        //cannot call private and default
    }
}

