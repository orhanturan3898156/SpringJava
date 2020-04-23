package Day25_Methods;

public class Return_Methods {
    public static void main(String[] args) {

        int result=max(3,5);
        System.out.println(result);

        int result2=max2(3,5);
        System.out.println(result2);

        System.out.println(max2(4,1));

    }


    //a ,b
    public static int max(int a, int b) {
        int max = 0;
        if (a >= b) {
            max = a;
        } else {
            max = b;
        }


        return max;
    }

    public static int max2(int a, int b) {

        if (a >= b) {
            return a;
        } else {
            return b;
        }


    }

}
