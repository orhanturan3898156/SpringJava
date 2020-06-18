package Day50_Polymorphism;

public class Recap_Summary {
    /*

    OOP: Encapsulation, Inheritance,Abstraction, Polymorphism

    1_Encapsulation: It helps to hiding data by giving private key word.Use public getter and setter methods to access them.
        getter: it is for READ ONLY. means you cannot read
        setter: you can re-assign/modify a new value to data you have.
      *If private data is final, we cannot reassigned/modify. Setter will complains.but you can still use getter method.


  ---------------------------------------------------------------------------------
    2_Inheritance: building relation between classes. We have super and sub class here.
        super class: cannot inherit anything from child class. benefit of super class is using it in Polymorphism.
        sub class  :can inherit VISIBLE variables and VISIBLE methods from super class.
        **Constructor CANNOT be inherited.
     -"extends" keyword is used for inheritance.
     -To be able to "override" we have to have inheritance.sub and super class.
     What advantages we get by applying inharitance?
       -less code
       -easy to read
       -reusable
       -easy to maintain
       protected:visible to same package and any subclass
       default: same package

  ---------------------------------------------------------------------------------

   3_Abstraction: hiding implementation details.Focusing on essentials/importance withour worrying about details.
      -It does NOT have  BODY.***Only thing in Java doesn't have body.
      -We will need to override. Pre condition of overriding is inheritance.
      -Then,Abstract keyword is used to achieve this purposes. Both method/s and super class itself.
      -Inherited class(subclass) must have all abstract methods.We have to override.
        **final cannot be override. Anthing final is protected to be changed/modified.
        **static cannot be override.
        **private cannot be override.
      -If we make subclass abstract, we don't have to override.However, we cannot create an object.


      WebDriver:
             get() :
             quit():

      ChromeDriver:
             get() :open websites from Chrome
             quit():closes chrome only

      FireFoxDriver:
             get() :open websites from Firefox
             quit():closes FireFox only

      OperaDriver:
             get() :open websites from Opera
             quit():closes Opera only

       - 2 ways to achieve this: Abstract and Interface (Pure abstract)
         1_Abstract class: not concrete. means cannot create an object.Meant to be super class.meant to be inherited.
          ***final class cannot be inherited. FINAL and ABSTRACT can never be together.
          -One class can only extend one class

         2_Interface : to extend more than one class we use interface.(Main reason). Pure abstraction. Use IMPLEMENTS keyword.
           -Everything you have is meant to be inherited. means you only have PUBLIC access modifier. By default everything is public, not default.Don't confuse here.

           So why do we have Interface still if it does almost everything?
           Interface method/s is by default public static final. So you cannot give any other access modifier. At this point, we need Abstraction.

           In Interface:
           We cannot have: constructors, instance variables, instance methods ,blocks. //constructor is creating objects that's why we cannot have it in Interface.

           **Interface cannot be final same as Abstraction.

           extends vs implements;
           class  extends    class //same type
           interface extends intends  //same type

           class implements interface //different type

           class extends class implements A1,A2,B3 //means we can extends and implements at the same time.

  ---------------------------------------------------------------------------------

        









     */
}
