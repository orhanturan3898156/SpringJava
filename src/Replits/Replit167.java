package Replits;

public class Replit167 {
    public static void main(String[] args) {

        String str = "java";
        String result=uniqueChars(str);
        System.out.println(result);


    }

    public static String uniqueChars(String str) {
        //String word=java >>>jav
        String result = "";
        String[] arr = str.split("");


        for (int i = 0; i < arr.length; i++) {
            if (!(result.contains(arr[i]))){
                result += arr[i];
            }
        }


        return result;
    }
}
