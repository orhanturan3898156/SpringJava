package Day22_Loops_and_Arrays_Practice;


public class Nested_forEach2 {
    public static void main(String[] args) {

        int[][] numbers = {{1, 2, 3},
                {4, 5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19, 20, 21}};

        int count=0;

        int sumoffOdd=0;
        int sumofEven=0;

        for (int[] each1DArray:numbers ){
            for (int eachelement:each1DArray){
                if (eachelement%2==0){
                    System.out.print(eachelement+" ");
                    sumofEven+=eachelement;
                }else {
                    count++;
                    sumoffOdd+=eachelement;
                }
            }
        }
        System.out.println();
        System.out.println(count);
        System.out.println(sumofEven);
        System.out.println(sumoffOdd);




    }
}
