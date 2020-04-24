package Office_Hours.Practice_04_15_2020;

public class A7_Nested_Loop2 {
    public static void main(String[] args) {

        //print all odd number
        //print all even number with each loop
        //use continue statement

        int[][] numbers = {{5, 4, 3, 2, 1},
                {10, 11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}};


        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] % 2 == 0) {
                    continue;
                }
                System.out.println(numbers[j][i]);
            }
            System.out.println();

        }

        System.out.println("\n===============================================================\n");

        for (int[] each1DArray : numbers) {
            for (int eachElement : each1DArray) {
                System.out.println(eachElement);
            }
        }


    }
}
