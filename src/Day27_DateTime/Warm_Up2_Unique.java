package Day27_DateTime;

public class Warm_Up2_Unique {
    public static void main(String[] args) {
        /*
        3. write a method that can print out the unique elements from an int array
           Ex: {1,1,2,3,3} ==> 2
           {6,6,7,7,8,9} ==> 8 9
           4. write a method that can print out the unique elements from a double array
           Note: Apply method overloading
         */


        int[] arr = {1, 1, 2, 3, 20, 4}; //2

        for (int each2 : arr) {

            int count = 0;

            for (int each : arr) {
                if (each == each2) {
                    count++;
                }

            }
            if (count == 1) {
                System.out.println(each2);
            }

        }


    }

    public static void uniqueElements(int[] arr) {
        for (int each2 : arr) {

            int count = 0;

            for (int each : arr) {
                if (each == each2) {
                    count++;
                }

            }
            if (count == 1) {
                System.out.println(each2);
            }

        }
    }


}
