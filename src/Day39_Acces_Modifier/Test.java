package Day39_Acces_Modifier;

public class Test {
    public static void main(String[] args) {
        Access_Modifiers obj = new Access_Modifiers();
        System.out.println(obj.defaultAccess); //default called

        System.out.println(obj.publicAccess);//since it is open. you can use it anywhere

        //System.out.println(obj.SSN); we cannot access,becuse we made it private.
    }
}
