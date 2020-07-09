package Day26_Method_Overloading;

public class Warm_Up2_Unique {
    /*
    2. use the above method to create another called uniques that accepts a string paramter and returns it's unique characters as String
    Ex: uniques("ABBC"); ==> "AC"
    uniques("Cybertek");  ==> "cybrtk"
     */
    public static void main(String[] args) {

        String str = "ABB";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int num = frequency(str, str.charAt(i));
            if (num == 1) {
                result += str.charAt(i);
            }

        }
        System.out.println(result);

        String str2="Cybertek";
        String result2=uniques(str2);
        System.out.println(result2);


    }
    public static String uniques(String str){
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int num = frequency(str, str.charAt(i));
            if (num == 1) {
                result += str.charAt(i);
            }

        }
        return result;
    }

    public static int frequency(String str, char ch) {
        int count = 0;
        char[] arr = str.toCharArray();
        for (int each : arr) {
            if (each == ch) {
                count++;
            }
        }
        return count; //AAA A

    }
}
