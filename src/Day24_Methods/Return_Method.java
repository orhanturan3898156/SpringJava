package Day24_Methods;

public class Return_Method {

    public static void maxNum(int a, int b){

        if (a>b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }


    }
    public static void main(String[] args) {
        /*
        return type: void , any other data type
        Anything other than void is return method.
        it is mandatory to return data from method
        return value must match with return type>>int to int or String to String
        after you use return statement, you cannot give any other statement. it is closing statement

         */
        // maxNum(10,20);
        int result=Addition(10,20);
        System.out.println(result);
        int result2=result+2000;
        System.out.println(result2);

        int result3=Addition(23,45);
        System.out.println(result3);


        System.out.println(result+result3);





    }

    public static int Addition(int a, int b){

        return a+b;
    }



}
