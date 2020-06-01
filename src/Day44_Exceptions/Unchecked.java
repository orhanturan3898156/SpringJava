package Day44_Exceptions;

public class Unchecked {

    /*

    unchecked (unexpected event): occurs during the run time. If you don't run your code ,you will never see the exception
    RunTime exception is the parent of all unchecked exceptions.




     */

    public static void main(String[] args) {

        //System.out.println(9 / 0);
        //without taking care of above "exception" ,remaining code will not be executed.
        System.out.println("test started");
        String str = "CyberTek";

        //System.out.println(str.charAt(-1)); out of index

        int[] arr = {1, 2, 3};
        //System.out.println(arr[2]);
        // System.out.println(arr[200]); //out of bouns

        System.out.println("Test Completed");


    }
}
