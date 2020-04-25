package Replits;

public class Replit154 {
    public static void main(String[] args) {

        palindromeNumber(454);
        System.out.println(4%10);


    }

    public static void palindromeNumber(int number) {

        //4334

        int remainder, reversed=0;
        int num=number;

        while (num!=0){
            remainder=num%10;
            reversed=reversed*10+remainder;



            num=num/10;



        }
        if (number==reversed){
            System.out.println("Palindrome");
        }else {
            System.out.println("not");
        }


    }
}
