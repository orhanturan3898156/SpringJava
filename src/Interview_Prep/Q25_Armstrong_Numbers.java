package Interview_Prep;

public class Q25_Armstrong_Numbers {
    //Write a method that can check if a number is Armstrong  number

    public static void main(String[] args) {

        System.out.println(amstrongNumber(153));


    }

    public static boolean amstrongNumber(int num) {
        int a = 0,    b =0,    c= num;

        while(num>0){
            a=num%10;//3   5
            num/=10;//15 5
            b=b+(a*a*a);//3*3*3 +5*5*5
        }
        if(c==b) {
            return true;
        }
        return false;
    }
}
