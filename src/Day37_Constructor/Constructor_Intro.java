package Day37_Constructor;

public class Constructor_Intro {
    /*
    Regular methods
                                 Must        Must
    Access-modifier specifier return-type methodName(Parameter){
    statements;

    }


   Access-modifier:public,protected, default, private
   specifier:static ,abstract,final, synchronized
   return-type:void, any-primitive and non-primitive
   method name: any name
   parameter: any data-type

   ==========================
   Constructor;
   Access-modifier MethodName(Parameters){
   statements
   }

   Example:
   Test         obj=new       Test()
   className    object       constructor

   **whenever you need an object .in order to create an object you have to have constructor.MANDATORY
   **method name has to be same with class name.

   */

    public  Constructor_Intro(int a){
        //if you create constructor, outside like this. it MUST be same with class name.

        System.out.println("Constructor with parameter of int");

    }

    public static void main(String[] args) {

        /*
        Constructor_Intro obj = new Constructor_Intro(); //this is default constructor.beacuse we didnt create it.it created by itself.
        //Every class must have this constructor.We dont create one, it will be created automaticly.See above example.

         */
        Constructor_Intro obj2=new Constructor_Intro(10);



    }

}
