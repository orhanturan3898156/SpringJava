package Day48_Abstraction;

public interface Interface_Intro { //this is not a class,but interface.
    /*

   1_ Why do we need Interface?
         -A class can inherit from one class only (extends)
         -A class can inherit multiple inheritance (implements)
   2_ What we can have in Interface?
         -Variables: by default variable you declared will be static and final together
         -Methods:
         -Abstract Method,static method,default methods(lambda expression,will learn later)

   3_ What cannot have in Interface?
         -Constructor.
         -Objects
         -Instance Variables and Instance Methods


    -It is the blue print of the class.
    -Specifies the behaviours a class should implement.
    -Interface is used for achiving abstraction. It is pure Abstraction.

    creating class:
                public class className{
                }

    Interface:
              public interface interfaceName{
              }


    //we cannot have contructor in interface,becuase contructor is for calling objects.
     */
    // when Interface, we don't have to give abstract key word.
    public abstract void method1(); // in normal class this is how we create an abstract class

    public void method2(); //by default public is here

    //it can be only public
    //Interface cannot be SuperClass,but supertype.
    //we will use "implements" key word when inherit.instead of "extends"

    void method3();//by default it is already public, not default.

    // protected void method4(); WE CANNOT give PROTECTED, and PRIVATE


    /*
    extends vs implements;
    extends;
       class extends abstract class
       class extends  class
       abstract class extends abstract class
       interface extends interface

    implements;
        class implements interface (we can as many as we want to)

     */


}
