package Day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class ArrayList_Intro {
    public static void main(String[] args) {

        /*
        ArrayList does not support primitive >>>important>>>only supports non-primitives

        ArrayLis< DataType > name=new ArrayList<DataType>();
                  mandatory                     optional
         */

        ArrayList<Integer>  scores=new ArrayList<Integer>();

        /*
        normally, when you create an Array , you have to specify Array size. but not same in ArrayList.
        it depends on items you add or remove

        *it is dynamic>>means can be changed

         */

        // add(): adds element to Array



        scores.add(10); //Autoboxing >>size of Array:1 now
        scores.add(20);
        scores.add(30); //size:3
        scores.add(45);

        System.out.println(scores);

        //getIndex():
        Integer a1=scores.get(2);  //none
        int a2=scores.get(2);      //unboxing
        double a3=scores.get(2);   //unboxing

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        //System.out.println(scores.get(100)); out of bound


    }
}
