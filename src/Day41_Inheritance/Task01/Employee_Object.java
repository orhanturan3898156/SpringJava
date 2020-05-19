package Day41_Inheritance.Task01;

public class Employee_Object {
    public static void main(String[] args) {

        Developer dev1 = new Developer(150000, "Namik", 343536, "SDET", 'M');

        dev1.fixingBug();
        System.out.println(dev1);

        System.out.println("===========================================================");

        Tester tester1 = new Tester("Mahmut", 130000, 234739, "QA", 'M');
        tester1.testing();
        tester1.reporting();

        System.out.println(tester1);

        System.out.println("===========================================================");

        Business_Analyst BA1 = new Business_Analyst("Jack", 65742, 200000, 'M');

        BA1.gathering();
        //BA1.testing(); we cannot call testing().
        BA1.writingReq();
        System.out.println(BA1);


    }
}
