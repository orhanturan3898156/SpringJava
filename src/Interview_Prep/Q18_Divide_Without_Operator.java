package Interview_Prep;

public class Q18_Divide_Without_Operator {
    //Write a method that can divide two numbers without using division operator

    public static void main(String[] args) {
        int num1 = 34;
        int num2 = 5;

        int count = 0;
        if (num2 == 0) {
            System.out.println("Invalid Entry");
        }

        while (num1 >= num2) {
            num1 = num1 - num2;
            count++;
        }
        System.out.println(count);
    }


}
