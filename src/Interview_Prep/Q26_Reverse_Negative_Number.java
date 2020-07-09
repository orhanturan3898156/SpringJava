package Interview_Prep;

public class Q26_Reverse_Negative_Number {
    public static void main(String[] args) {
        //Write a return method that can reverse negative number and return it as int

        System.out.println(reverseNumber(-34567));


    }

    public static int reverseNumber(int num) {

        String str = new StringBuilder("" + num).reverse().toString();

        if (num < 0) {
            str = "-" + str.substring(0, str.length() - 1);
        }

        return Integer.valueOf(str);


    }


}
