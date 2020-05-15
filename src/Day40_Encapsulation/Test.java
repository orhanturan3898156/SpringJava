package Day40_Encapsulation;

public class Test {
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        //System.out.println(obj.SSN); cannot be accessed. it it private.

        System.out.println(obj.getSSN()); //0

        obj.setSSN(123456);
        System.out.println(obj.getSSN()); //123456



    }
}
