package Day44_Exceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class Try_and_Catch {
    /*
    try{

    } catch(ExceptionClass )



     */
    public static void main(String[] args) {
        System.out.println("Test Started");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));


        try {
            System.out.println(list.get(10));
        } catch (IndexOutOfBoundsException e) { //in java we give "e",but can be anything.
            //We can give "IndexOutOfBoundsException" parents as well.
            //We can give "Exception" to all. it will work.
            System.out.println("something went wrong");
        }

        System.out.println("Test Completed");


    }
}
