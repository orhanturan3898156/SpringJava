package Day22_Loops_and_Arrays_Practice;

public class Nested_Loop_3 {
    public static void main(String[] args) {

        //find even numbers
        //find count of odd number

        int[][] numbers = {{1, 2, 3},
                {4, 5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19, 20, 21}};


        int countofodd = 0;


        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] % 2 == 0) {
                    System.out.print(numbers[j][i] + " ");
                } else {
                    countofodd++;
                }
            }
        }
        System.out.println();
        System.out.println(countofodd);


    }
}
