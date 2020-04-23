package Day18_Nested_Loop_DoWhile;

public class Warm_Up_Divide_Two_Numbers {
    public static void main(String[] args) {
        /*
        . write a program that can divide two numbers.Assume that first is greater than second
          NOTE: DO NOT USE division, multiplication, or module operators
         */

        int a = 19;
        int b = 5;
        if (b==0){
            System.out.println("b cannot be 0");
            System.exit(0);
        }


        int count = 0;
        while (a >= b) {
            a -= b;
            count++;
        }
        System.out.println(count);
        System.out.println(a);

        System.out.println("======================================\n");

        int c=15;
        int d=3;
        int result=0;

        while (c>d){
            System.out.println(c/d);
            result++;
            break;

        }



    }
}
