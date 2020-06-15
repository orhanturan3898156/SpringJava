package Day49_Polymorphisim;

public class PhoneObject {
    public static void main(String[] args) {
        iPhone phone1 = new iPhone("11Max", 1250, "14 inches");

        System.out.println(phone1);
        phone1.download();
        phone1.texting(1236355);
        phone1.calling(912732782);
        phone1.faceTiming(123434546);


    }
}
