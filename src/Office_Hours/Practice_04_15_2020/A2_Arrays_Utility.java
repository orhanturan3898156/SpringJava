package Office_Hours.Practice_04_15_2020;

import java.util.Arrays;

public class A2_Arrays_Utility {
    public static void main(String[] args) {

        int[] arr = {9, 10, 8, 65, 8, 6, 6};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int[] salaries = {100000, 200000, 30, 4000, 50000, 240000};

        int length = salaries.length;
        int lastindex = salaries.length - 1;
        Arrays.sort(salaries);
        System.out.println("minimum salary is " + salaries[0]);

        System.out.println("\n===================\n");

        //Equal




    }
}
