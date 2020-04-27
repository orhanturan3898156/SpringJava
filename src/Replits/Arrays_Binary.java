package Replits;

import java.util.Scanner;

public class Arrays_Binary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] binary = new int[8];
        for(int i =0; i < binary.length; i++) {
            binary[i] = input.nextInt();
        }

        //TODO: Write your code below.
        int binary1[] ={128,64,32,16,8,4,2,1};
        int sum =0;
        for(int i = 0;i<binary.length;i++){
            if(binary[i]==1){
                sum+=binary1[i];
            }else{
                sum += binary[i];
            }
        }
        System.out.println(sum);

    }
}
