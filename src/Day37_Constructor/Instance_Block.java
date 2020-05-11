package Day37_Constructor;

public class Instance_Block {
    /*
    two initializer block in java;
    static initializer;gets executed as soon as as class is loaded, only once
    static{
         statements;
          }

    instance initalizer block;belongs to the object. execution depends on object/s.
          {
          statements;

          }



     */
    static {
        System.out.println("static block !!!");
    }


    {
        System.out.println("Instance block1.."); // we have to create an object to be able to execute it.
    }

    public static void main(String[] args) {
        Instance_Block obj = new Instance_Block();

        Instance_Block obj2 = new Instance_Block();

        // we will use Constructor in real time, not this. !!!!


    }

    {
        System.out.println("Instance block2..");
    }


}
