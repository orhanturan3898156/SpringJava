package Day43_Method_Overwriting;

class Test {
    public void method() {
        System.out.println("Onur");
    }
}

public class Method_Overriding extends Test {
    /*
      method Over-writing: same method same parameter,and same return type --Functionalty is different only
      -it cannot be private .It has to be visible to sub class.
      -it can be default, public and protected).It could be more visible
          visibility: public > protected > default > private
      -pre-condition:  MUST take place in the sub-class
      -@override: identifies if the method is overridien or not

      --***Static method and constructor CANNOT be overridden.
      ---Only instance method can be overridden.


     */
    @Override  //-@override: identifies if the method is overridien or not
    public void method() {
        System.out.println("Zarina");
    }

    public static void main(String[] args) {
        Test obj1 = new Test();
        obj1.method();


        Method_Overriding obj2 = new Method_Overriding();
        obj2.method();
    }

}
