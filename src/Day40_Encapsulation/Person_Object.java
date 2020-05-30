package Day40_Encapsulation;

public class Person_Object {
    public static void main(String[] args) {
        Person Zarina = new Person("Zarina");
        System.out.println(Zarina.name);

        //System.out.println(Zarina.SSN); for now, it is not accessible.since it is private

        //System.out.println(Zarina.getSSN()); //it will give us 0 as a default value.
        //we firstly set the data , then get it.
        Zarina.setSSN(123456789);
        System.out.println("Zarina's SSN: "+Zarina.getSSN());

        Person Ahmet=new Person("Ahmet");

        System.out.println(Ahmet.name);
        System.out.println(Ahmet.getSSN());

        Ahmet.setSSN(123333);

        System.out.println(Ahmet.getSSN());


    }
}
