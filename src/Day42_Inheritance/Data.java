package Day42_Inheritance;

public class Data {
    /*
    protected: visible in the same package,visible int the subclass outside package

    Inheritance: sub class & super class
    subclass: can inherit VISIBLE  variable and  VISIBLE methods from super class.
    ---private: can never be inherited in subclass
    ---default: can be inherited as long as subclass is in the same package.
    ---public and protected regardless of where they are, they can be inherited at anywhere.

    public > protected > default > private


    super class: cannot inherit anything from subclass.

    - constructor is not inherited

     */

    public static String publicData = "public";
    protected static String protectedData = "protected";
    static String defaultData = "default";
    private static String privateData = "private";

}

class testing extends Data {
    /*
    public,default,protected are inherited , but not private
     */
    public static void main(String[] args) {

        System.out.println(testing.defaultData);
        System.out.println(testing.protectedData);
        System.out.println(testing.publicData);
        //System.out.println(testing.privateData); cannot be called.


    }
}