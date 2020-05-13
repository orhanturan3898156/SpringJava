package Day38_Constructors;

public class Test {
    public Test() {
        System.out.println("constructor");
    }

    static {
        System.out.println("static block");
    }

    {
        System.out.println("instance block");
    }

    public static void main(String[] args) {
        new Test();
        //always static executed first.no matter it is on top or bottom.
        new Test();
    }
}
