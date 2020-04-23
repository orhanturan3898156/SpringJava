package Day18_Nested_Loop_DoWhile;

public class Nested_Loop2 {
    public static void main(String[] args) {

        /*
         *
         * *
         * *  *
         * *  * *
         * * * * *



         */

        for (int j=1;j<=9;j++){
            for (int i=1;i<=j;i++){
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println("\n===\n");

        for (int j=9;j>=0;j--) {
            for (int i = 1; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println("\n===\n");

        for (char z='a';z<='e';z++ ){
            for (char ch='a';ch<=z;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();

        }








    }

}
