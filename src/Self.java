import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Self {
    public static void main(String[] args) {

        String str = "a1b2c3d4";

        char[] arr=str.toCharArray();
        System.out.println(Arrays.toString(arr));
int sum=0;
        for (Character each:arr){
            if (Character.isDigit(each)){
                sum+=Integer.parseInt(""+each);
            }
        }
        System.out.println(sum);

        for (int i = 0; i <arr.length ; i++) {
            if (Character.isDigit(arr[i])){
                sum+=Integer.parseInt(""+arr[i]);
            }
        }
        System.out.println(sum);



    }




}
