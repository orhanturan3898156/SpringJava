package Interview_Prep;

public class A_Howto_Reverse_Numbers {
    public static void main(String[] args) {
        int number = 12345;

        String str = new StringBuilder("" + number).reverse().toString();

        System.out.println(str + 1);


    }
}
