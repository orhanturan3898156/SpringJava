package Replits;

public class Replit153 {
    public static void main(String[] args) {

        String[] words = {"java", "code", "python", "code", "rust", "code", "rust"};

        String result=unique(words);
        System.out.println(result);


    }

    public static String unique(String[] arr) {

        String result = "";
        for (int j = 0; j < arr.length; j++) {

            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equalsIgnoreCase(arr[j])) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(arr[j]);
            }

        }


        return result;


    }


}
