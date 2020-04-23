package Day27_DateTime;

public class Warm_Up1_Find_Minimum {
    /*
    Warmup task:
    1. write a return method that can return the minimum number from an int array
     */
    /*
     2. write a return method that can return the minimum number from a double array
       NOTE: apply method overloading,  DO NOT USE SORT
     */
    public static void main(String[] args) {

        int[] arr = {5, 4, 7, 5};
        int minumum = arr[0];

        for (int each : arr) {
            if (each < minumum) {
                minumum = each;

            }
        }
        System.out.println(minumum);

        System.out.println("========================================================");

        int[] arr2 = {100, 2000, 3000, 40, 50, -100, -9000};

        int result = minumum(arr2);
        System.out.println(result);

        double[] arr3 = {55, 15.5, 10.3, 1.5, 2.3};
        double num1 = minimum(arr3);
        System.out.println(num1);


    }

    public static int minumum(int[] arr) {


        int minumum = arr[0];

        for (int each : arr) {
            if (each < minumum) {
                minumum = each;

            }
        }

        return minumum;


    }

    public static double minimum(double[] arr) {
        double minumum = arr[0];

        for (double each : arr) {
            if (each < minumum) {
                minumum = each;

            }
        }

        return minumum;


    }

}
