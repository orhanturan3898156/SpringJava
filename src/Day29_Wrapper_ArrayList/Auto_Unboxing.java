package Day29_Wrapper_ArrayList;

public class Auto_Unboxing {
    public static void main(String[] args) {


        //Auto Boxing: converting primitive value to wrapper class
        //Unboxing: converting wrapper class value to primitive.It is done automaticly.

        int a = 100; //primitive
        Integer b = a; //Autoboxing

        Byte byte1 = 98;
        short short1 = byte1;// unboxing //you can assign it to other primitive,but not same for wrapper.
        // wrappers are only for their own primitive
        byte b2 = byte1;    //unboxing
        int int1 = byte1;   //unboxing


    }
}
