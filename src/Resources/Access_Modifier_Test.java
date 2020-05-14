package Resources;

import Day39_Acces_Modifier.Access_Modifiers;

public class Access_Modifier_Test {

    public static void main(String[] args) {
        Access_Modifiers obj=new Access_Modifiers();
        //System.out.println(obj.defaultAccess); we cannot call it.because it is default and only works in the same package

        System.out.println(obj.publicAccess);//this works even it is in the different package
    }
}
