import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SelfStudy {
    public static void main(String[] args) {
        //13

       grade(3.12);

    }

    public static void grade(double score) {
        String result = "";

        if (score <= 4 && score >= 0) {
            result = (score == 4) ? "A+" :
            (score < 4 && score >= 75) ? "A" :
            (score < 3.75 && score >= 3.5) ? "A-" :
            (score < 3.5 && score >= 3.25) ? "B+" :
             (score < 3.25 && score >= 3) ? "B" :
             (score < 3 && score >= 2.75) ? "B-" :
             (score < 2.75 && score >= 2) ? "C" :
             "F";


        } else {
            result = "Invalid";
        }


        System.out.println(result);
    }
}
