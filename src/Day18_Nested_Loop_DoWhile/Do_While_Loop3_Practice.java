package Day18_Nested_Loop_DoWhile;

public class Do_While_Loop3_Practice {
    public static void main(String[] args) {
        //even numbers between 0 -100;

        int number = 0;
        do {
            if (number % 2 == 0) {

                System.out.print(number + " ");
            }
            number++;
        } while (number <= 100);

        System.out.println("\n=========================\n");

        int a=1;
        do {
            //a++;
            System.out.print(a+" ");
            a++;

        }while (a<=5);

        System.out.println("\n=========================\n");

        int z=1;
        do {

            System.out.print(z+" ");
            if (z==3){
                break;
            }
            z++;


        }while (z<=5);

        System.out.println("\n=========================\n");

        int y=1;
        do {
            if (y==3){
                y++;
                continue;
            }
            System.out.print(y);
            y++;


        }while (y<=5);

        System.out.println("\n=========================\n");

        int t=1;
        do {
            if (t%2!=0){
                t++;
                continue;
            }
            System.out.print(t+" ");
            t++;

        }while (t<=100);


    }
}
