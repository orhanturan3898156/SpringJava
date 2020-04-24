package Office_Hours.Practice_04_08_2020;
public class Do_While_Loop {
    public static void main(String[] args) {

        /*
        only difference with while loop is it executes the loop at least one time

        do{

        statement

        }while(condition);


         */

        int i = 1;

        do {

            if (i % 15 == 0) {
                System.out.print(i + " ");
            }

            i++;

        } while (i <= 100);


    }
}
