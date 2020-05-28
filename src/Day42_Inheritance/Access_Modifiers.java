package Day42_Inheritance;

public class Access_Modifiers {
    public static String publicVariable = "public";
    protected static String protectedVariable = "protected";
    static String defaultVariable = "default";
    private static String privateVariable = "private";

    //we made them static to call them through class name.
    //otherwise we will need to create an object first.

    //in the same package: public,protected,defualt can be inherited
    //in the different package: only public and protected can be inherited

    public static void publicMethod() {

    }

    protected static void protectedMethod() {

    }

    static void defaultMethod() {

    }

    private static void privateMethod() {

    }


}
