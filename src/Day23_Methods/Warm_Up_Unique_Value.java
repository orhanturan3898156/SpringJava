package Day23_Methods;

public class Warm_Up_Unique_Value {
    public static void main(String[] args) {
        /*
        warmup task:
        1.  Write a program that can print out the unique values from a String Array
        Ex:
        if arr -> {"A", "A", "B", "C", "C"}
        output: B
        if arr -> {"A", "B", "B", "C"}
        output:  A  
                 C
        MUST use for each loop
         */

        String[] arr = {"A", "B", "A", "C", "C", "D", "E", "F"};

        //solution 1

        for (int j = 0; j < arr.length; j++) {

            int count2 = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(arr[j])) {
                    count2++;
                }

            }
            if (count2 == 1) {
                System.out.println(arr[j]);
            }
        }
    }
}