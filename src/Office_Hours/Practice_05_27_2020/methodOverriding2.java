package Office_Hours.Practice_05_27_2020;

public class methodOverriding2 {
    protected void method1() {

    }

    public static void method2() {

    }

    public methodOverriding2() {

    }


}

class TestClass extends methodOverriding2 {
    @Override
    public void method1() {

    }

    public static void method2() {

    }  //static method cannot be Overridden.
    /*
   public methodOverriding2(){ cannot be Overridden.
   }
  */

}
