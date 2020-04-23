package Day20_Arrays;

import java.util.Arrays;

public class Arrays_Sorting {
    public static void main(String[] args) {
        /*
        Arrays.sort(arrayName): sort hte given array in ascending order

         */
        int[] arr1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("First min number is " + arr1[0]);
        System.out.println("Second min number is " + arr1[1]);

        System.out.println("First max number is " + arr1[arr1.length - 1]);
        System.out.println("Second max number is " + arr1[arr1.length - 2]);
        System.out.println("Median number is " + arr1[(arr1.length - 1) / 2]);

        System.out.println("\n==================================\n");

        char[] ch = {'Z', 'D', 'W', 'Y', 'A', 'B', 'E', 'D'};
        System.out.println(Arrays.toString(ch));
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));
        System.out.println(ch[0]);

        System.out.println("\n==================================\n");

        String[] names = {"Osman", "Rustem", "Mahmut", "Kazim", "Ibo"};
        System.out.println(names);
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        System.out.println("\n==================================\n");

        String[] names2 = {"Osman", "Rustem", "Mahmut", "Kazim", "Ibo"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names2));

        for (int i = names2.length - 1; i >= 0; i--) {

            System.out.print(names[i] + " ");


        }

        System.out.println("\n==================================\n");
        int[] numbers = {3, 1, 4, -1, 100, -100, 200, 155};

        int k = 0;

        int[] numbersDesc = new int[numbers.length];
        //System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        for (int j = numbers.length - 1; j >= 0; j--) {
            //System.out.print(numbers[j]+" ");
            numbersDesc[k] = numbers[j];

            k++;
        }
        System.out.println(Arrays.toString(numbersDesc));


    }
}
