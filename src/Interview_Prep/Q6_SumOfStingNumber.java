package Interview_Prep;

public class Q6_SumOfStingNumber {

    public static void main(String[] args) {

        String str="AA34255BV";
        int r1=sumOfNumber(str);
        System.out.println(r1);


    }

    public static int sumOfNumber(String word) {
        //A3B456
        char[] arr = word.toCharArray();

        int sum = 0;

        for (int i = 0; i < word.length(); i++) {
            if (!Character.isAlphabetic(arr[i])) {
                sum += Integer.valueOf(""+arr[i]);
            }
        }
        return sum;


    }
}
