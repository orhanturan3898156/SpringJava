package Replits;

public class Replit154_Palindrome_Numbers {
    public static void main(String[] args) {

        palindromeNumber(454);
        System.out.println(4%10);


    }

    public static void palindromeNumber(int number) {

        //454




        int remainder, reversed=0;
        int num=number;

        while (num!=0){
            remainder=num%10;                  /// 4 5 4
            reversed=reversed*10+remainder;   ///4  45
            //
            //
            //



            num=num/10;
            //454   45
            //45    4
            //



        }
        if (number==reversed){
            System.out.println("Palindrome");
        }else {
            System.out.println("not");
        }


    }
}
