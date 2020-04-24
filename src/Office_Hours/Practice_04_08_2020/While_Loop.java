package Office_Hours.Practice_04_08_2020;

public class While_Loop {
    public static void main(String[] args) {

        /*

        initialization
        while(condition){
        statements
        iterator;

        }

         */

        int i = 1;
        while (i <= 5) {
            System.out.println("Hello");
            i++;
        }

        System.out.println("\n===========\n");

        int z = 0;
        while (z <= 100) {
            if (z % 15 == 0) {
                System.out.print(z + " ");

            }
            z++;
        }


    }
}
