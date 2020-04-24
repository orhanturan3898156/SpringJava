package Day15_For_Loop;


import java.util.Scanner;

public class Warmup2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("write Java");
        String str=scan.next();

        String reverse1=""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);

        String reverse2=str.substring(3)+str.substring(2,3)+str.substring(1,2)+str.substring(0,1);

        System.out.println(reverse1);
        System.out.println(reverse2);


    }
}
