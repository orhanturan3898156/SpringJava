package Resources;

import Day40_Encapsulation.Encapsulation;

public class Encapsulation_Test {
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();

       //System.out.println(obj.SSN);
        //there is no direct acces to private data,but the methods

        System.out.println(obj.getSSN());
        obj.setSSN(123456789);
        System.out.println(obj.getSSN());


    }
}