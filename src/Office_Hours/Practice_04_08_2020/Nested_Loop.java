package Office_Hours.Practice_04_08_2020;

public class Nested_Loop {
    public static void main(String[] args) {
        /*
        it is like nested if.
        it is loop inside another loop
        it repeats inner loop;



         */

        int j = 1;
        while (j <= 5) {
            for (int i = 10; i <= 50; i += 10) {
                System.out.print(i + " ");
            }
            System.out.println();

            j++;
        }

        System.out.println("\n============================\n");


        for (int b = 1; b <= 8; b++) {
            for (int a = 1; a <= 6; a++) {
                System.out.print("* ");
            }
            System.out.println();


        }


    }

}
