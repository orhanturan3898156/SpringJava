package Day18_Nested_Loop_DoWhile;

public class Nested_Loop {
    public static void main(String[] args) {

        //nested loop>>>loop in another loop

        for (int j = 0; j < 5; j++) {
            for (int i = 1; i <= 5; i++) {

                System.out.print(i);


            }
            System.out.println();


        }
        System.out.println("\n==============================\n");


        for (int i=0;i<7;i++){
            int a=1;
            while (a<=10) {
                System.out.print("*");
                a++;
            }
            System.out.println();
        }


    }
}
