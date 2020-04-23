package Day19_Arrays;

import java.util.Scanner;

public class Arrays3_Practice_Initialization_of_Arrays {
    public static void main(String[] args) {
        /*
        First way: giving values:size will be initalized automaticly
        int[] arr={10,20,30}
        int[] arr=

        Second way:(Length of Array)
         int[] arr=new int(length);
         int[] arr=new int(5);

         */


        int[] arr={10,20,30};
        System.out.println(arr.length);

        int[] arr2=new int[5];
        System.out.println(arr2[0]);  ///default is 0 for int


        String[] testers=new String[3]; //{"Reem","Medine","Osman"}

        testers[0]="Reem";
        testers[1]="Medina";
        testers[2]="Osman";


        System.out.println(testers[0]);  ///default is "NULL" for String
        System.out.println(testers[1]);
        System.out.println(testers[2]);
        //System.out.println(testers[3]); it is not going to be executed because there is no index 3 her.size is 3 ,but index is -1
        System.out.println(testers.length);

        System.out.println("\n================================\n");

        Scanner scan=new Scanner(System.in);

        for (int i=0;i<10;i++){
            System.out.println("Student name");
            String studentname=scan.next();
            int[] students=new int [10];
            System.out.println(students[i]);
        }












    }
}
