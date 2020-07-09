package Interview_Prep;

public class Q24_Fibinnaci {
    public static void main(String[] args) {
        //Write a return method that returns the  Fibonacci of any given number

        System.out.println(fib(3));

        //1 2 3 5 8 13 21

    }

    public static int fib(int num){

        int result=0;
        int j=0;
        int z=1;

        for(int i=1; i<num; i++){

            result=j+z;
            j=z;
            z=result;

        }

        return result;

    }
}
