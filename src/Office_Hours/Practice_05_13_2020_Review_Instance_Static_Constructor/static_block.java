package Office_Hours.Practice_05_13_2020_Review_Instance_Static_Constructor;

public class static_block {
    static String str;
    // str.toUpperCase(); does not work here.

    static {
        str = "CyberTek";
        // str.toUpperCase(); works here
    }
}

class staticBlockTest {
    public static void main(String[] args) {
        System.out.println(static_block.str);
    }
}