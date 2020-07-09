package Interview_Prep;

public class Q21_Consecutive_Numbers {
    public static void main(String[] args) {
        /*
Write a function:
that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line.
However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively.
If a number is divisible by more than one of the numbers: 2,3 or 5,
it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.
For example, numbers divisible by both 2 and 3 should be replacée by CodilityTest and numbers divisible by all three numbers:
2,3 and 5, should be replaced by CodilityTestCoders.
         */

        consecutive(30);


    }

    public static void consecutive(int number) {

        if (number < 0) {
            System.out.println("must be psotive");
        }

        if (number > 0) {

            String result = "";


            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                    result += i + " CodilityTestCoders\n";

                } else if (i % 2 == 0) {
                    result += i + " Codility\n";

                } else if (i % 3 == 0) {
                    result += i + " Test\n ";
                } else if (i % 5 == 0) {
                    result += i + " Coders\n ";

                }

            }
            System.out.println(result);


        }


    }

}
