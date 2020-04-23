package Day24_Methods;

import java.util.Arrays;

public class Task2 {
    public static void reversed(String[] array){

        //String[] nwords={"Orhan","Elif"};

        String[] reversedarr=new String[array.length];
        int j=reversedarr.length-1;

        for (int i=0;i<array.length;i++){
            reversedarr[i]=array[j];
            j--;

        }
        System.out.println(Arrays.toString(reversedarr));


    }

    public static void Desending(int[] array){
        Arrays.sort(array);
        for (int i=array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        String[] arr2={"Yusuf","Mehmet","Elif"};
        reversed(arr2);

        int[] numbers={1,2,-5,34,-98,45};
        Desending(numbers);



    }
}
