import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Self {
    public static void main(String[] args) {
        int[] arr1={1,1,2,3,2,3};

        String result="";

        for (int i=0;i<arr1.length;i++){
            if (!result.contains(""+arr1[i])){
                result+=arr1[i];
            }
        }
        System.out.println(result);



    }


}