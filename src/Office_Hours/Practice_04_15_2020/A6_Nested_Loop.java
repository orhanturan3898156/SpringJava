package Office_Hours.Practice_04_15_2020;

public class A6_Nested_Loop {
    public static void main(String[] args) {

        char[][] arr2D = {{'A', 'B'}, {'C', 'D', 'E'}, {'F', 'G', 'H'}};


        for (int j = 0; j < arr2D.length; j++) {
            for (int i = 0; i < arr2D[j].length; i++) {
                System.out.print(arr2D[j][i] + " ");
            }
            System.out.println();

        }

        System.out.println("\n==============================\n");

        for (char[] each1Darry : arr2D) {
            for (char eachElement : each1Darry){
                System.out.println(eachElement);
            }
        }


    }
}
