package Day18_Nested_Loop_DoWhile;

public class Reverse_String {
    public static void main(String[] args) {

        String str = "Java";
        String reversed = "";
        int lastindex = str.length() - 1;


        int i = lastindex;


        do {
            reversed += str.charAt(lastindex);

            lastindex--;


        } while (lastindex >= 0);
        System.out.println(reversed);


    }
}
