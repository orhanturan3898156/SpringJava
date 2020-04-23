package Day22_Loops_and_Arrays_Practice;



import java.util.Arrays;

public class Nested_forEach {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int each : arr) {
            System.out.println(each);
        }


        System.out.println("\n===============\n");

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}};
        //     0          1
        for (int[] each2D : arr2D) {
            for (int eachElement : each2D) {
                System.out.println(eachElement);
            }
        }
        System.out.println("\n===============\n");

        char[][] ch2D={ {'A','B'},{'C','D','E'} };

        for (char[] each1Darray: ch2D){
            for (char eachelement:each1Darray){
                System.out.println(eachelement);
            }
        }


    }
}
