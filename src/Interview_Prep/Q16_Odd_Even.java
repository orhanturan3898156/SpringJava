package Interview_Prep;

public class Q16_Odd_Even {
    public static void main(String[] args) {
        //Write  a method which can identifies given number is even or odd

        String r1 = oddEven2(0);
        System.out.println(r1);


    }

    public static String oddEven(int number) {

        String result = "";
        if (number % 2 == 0) {
            return result = "Even Number";
        } else {
            return result = "Odd Number";
        }


    }

    public static String oddEven2(int number) {

        return (number % 2 == 0) ? "Even Number" : "Odd Number";

    }


}
