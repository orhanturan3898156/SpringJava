package Z_NOTES;

public class Inheritance_AccessModifier_Overriding {
    /*

    INHERITANCE

    Inheritance : easiest way to get rich     
    builds relationship between classes 
    super(parent) & sub (child) relationships
    •The keyword used for inheritance is extends    
    Dog : child class        
    Animal : parent class       
    public class Dog extends Animal{ }    
    •Super Class:  The class whose features are inherited is known as super class(or a base class or a parent class)    
    •Sub Class:  The class that inherits the other class is known as sub class(derived class, or child class). 
    The subclass can add its own fields and methods in addition to the superclass fields and methods.
    Super (Parent) class Animal: Name Body Size Weight Eat Move   
    sub (Child) class Dog : Name Body Size Weight Eat Move Legs   
    sub (Child) class Fish: Name Body Size Weight Eat Move Gills Swim    s
    ub (Child) class Bird: Name Body Size Weight Eat Move Sing Fly•
    --------------------------
    In OOP, inheritance is used to create an “is-a” relationship among classes:
    Dog is a Animal   Bird is a Animal    Fish is a Animal•
    Inheritance is an OOP concept in Java which allows one class to inherit the features(fields and methods) of an another class.

    Types of Inheritance:   
    1• Single Inheritance : Subclasses inherit the features of one superclass:   
    public class A { }   ===>     public class B extends A{  }                “is a” relationship:         B is a A   
    2• Multi Level Inheritance : A Subclass will be inheriting a Super Class.
    The subclass also acts SuperClass to another subclass.   
    public class A { }   ===>     public class B extends A{  }                         ===>     public class C extends B{  }            
    “is a” relationship:         B is a A                                          C is a B   
    3• Hierarchical Inheritance : Once class serves as superclass for more than one sub class.   
    public class A { }   ===>     public class B extends A{  }                                 public class C extends A{  } 
      public class D extends A{  }              “is a” relationship:         B is a A    
                                           C is a A                                           D is a A   
    4•Multiple Inheritance : Java DOES NOT support multiple inheritance with classes.   
    One class can not have more than one superclass and inherit features from all parent class.
    Advantage of inheritance:

    improves re-usability                           
    easy to maintain we can only inherit VISIBLE variables and methods from the super (parent) we do not have to repeat initializing same variables and methods

    */

    /*

    ACCESS MODIFIER

    Summary of Access Modifiers: public > protected > default > private
    • we can call public variables and methods any where in any class in one whole project.
    • we can call protected variables and methods in any class in one package.
    • we can call protected variables and methods in any sub class in one whole project.
    • we can call default variables and methods in any class in one package ONLY.
    • we can call private variables and methods inside one class ONLY.

     */

    /*

    OVERRIDING
    to override method:
                        * can be done ONLY in SUB class (==> or it will get compile error)
                        * MUST BE SAME method name, SAME parameter, SAME returnType
                        * CAN NOT have private access modifier ( it will not be inherited)
                        * Access modifier MUST be same or more accessible than the original one
                            default ==> protected ==> public
                        * STATIC can NOT be overridden == only ONE copy for all objects
                        * CONSTRUCTORS can NOT be overridden == it can NOT be inherited
                        * Only INSTANCE methods can be overridden
   @Override : identifies if method is overridden or not. Must be applicable.
   Only ONE method is created in memory (The one created in Super class).
   One method with different functions when we override.
     */

    /*

    Object-oriented:  Everything is considered to be an “object” which possess some state,
    behavior and all the operations are performed using these objects.
    Encapsulation: Data Hiding
     •An object hides its internal data from code that is outside the class that the object is an instance of.
     •Only the current class’s methods can directly access and make changes to the instance variables
     •You hide an instance variable by giving private access modifier,  and making the methods that access those fields public.
     •These public methods are called getters and setters (accessor and mutator)
    1. hide the data by giving ‘private’ access modifier
    2. grant other classes access to use the ‘private’ data through getter and setter (public methods)
      •We can provide only getter in a class to make the variable immutable. (Read only)
      •We can provide only setter in a class to make the class attribute. (write-only)

     */

    /*
    ----------------------------------------------------------------------------

OverRiding: (short)
    * ONLY happens in SUB class (INHERITANCE relationship MUST exist)
    * SAME method name
    * SAME parameter
    * SAME return-type
    * DIFFERENT implementation
    * SAME, or more visible, access modifier :PUBLIC > PROTECTED > DEFAULT > PRIVATE
    * Instance method CAN always be overridden (except private ones)
    * STATIC methods can NOT be overridden
    * Constructor CAN NOT be overridden
    * ONLY INSTANCE METHODS (NOT WITH PRIVATE ACCESS MODIFIER) CAN BE OVERRIDDEN
-------------------------------------------------------------------------------
ENCAPSULATION:(short)
            * Hiding the data by giving private Access Modifier : CAN NOT BE ACCESSED OUTSIDE CLASS
            * Other sources can only access it through public getter/setter
            * getter (READ_ONLY): returns the private data
            * setter (WRITE_ONLY): assigns argument to the private data
-------------------------------------------------------------------------------
 */

/*
INHERITANCE:(short)
            * builds relationship between super and sub classes
            * IS-A relationship: sub IS-A super
            * sub class: inherits visible variables and methods
            * super class: can NOT inherit from sub class
            * Advantages:
                    * Reusable
                    * Readable
                    * Organized
                    * Easy to memorize (one name for all)
                    * Easy to maintain (you fix in one place if needed)

-------------------------------------------------------------------------------
OverLoading:  (short)
  * happens in SAME class    
  * SAME method name    
  * DIFFERENT parameter    
  * Return type does NOT matter    
  * Access modifier does NOT matter    
  * Instance method CAN be overloaded    
  * STATIC methods CAN be overloaded    
  * Constructor CAN be overloaded    
  * ALL METHODS CAN BE OVERLOADED

     */



}
