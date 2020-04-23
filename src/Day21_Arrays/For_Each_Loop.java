package Day21_Arrays;

public class For_Each_Loop {
    public static void main(String[] args) {
        /*
        for(DataType vaiableName: ArrayNAme){
        }

        variable name represents each of the data in the array
        Datatype MUST be matched with Arrya's data type
        number of the execution times of the loop depends on the size of the array

        When you dont need provide index number you can use this method.
        Iteration is always started index 0.
        if you want to reverse you cannot.


         */

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int each : nums) {
            if (each > 5) {
                System.out.println(each);
            }
        }

        String[] students = {"Muhtar", "Asiya", "Murodil"};

        for (String each : students) {
            System.out.print(each + " ");
        }


    }
}
