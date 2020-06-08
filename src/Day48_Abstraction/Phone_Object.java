package Day48_Abstraction;

public class Phone_Object {
    public static void main(String[] args) {

        iPhone iphone1 = new iPhone("ProMax", 1250, "13 inches");
        iPhone iphone2 = new iPhone("9", 90, "10 inches");

        System.out.println(iphone1);
        System.out.println(iphone2);
        iphone1.faceTiming(123456789);
        iphone1.calling(911);
        iphone1.texting(1123354253);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Samsung samsung1 = new Samsung("Galaxy", 750, "12 inches");
        Samsung samsung2 = new Samsung("Note10", 500, "10 inches");

        System.out.println(samsung1);
        System.out.println(samsung2);

        samsung1.calling(45329098);
        samsung1.texting(2432536);
        samsung1.freezing();


    }
}
