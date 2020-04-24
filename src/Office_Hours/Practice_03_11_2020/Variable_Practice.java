package Office_Hours.Practice_03_11_2020;

public class Variable_Practice {
    public static void main(String[] args) {

        // double> float> long> int> short> byte
        byte num1 = 127;
        short num2 = num1;
        int num4 = num2;

        float num5 = 100l;
        double num6 = num5;
        //int num7=num6;// you can not assign double float to int
        //float num7=num6;// same thing here -- double>float
        char ch2 = 2000;
        char ch3 = 'r';

        System.out.println('a' == 'b' - 2);
        System.out.println(ch2);
        System.out.println(num6);
        System.out.println(ch3);


    }
}
