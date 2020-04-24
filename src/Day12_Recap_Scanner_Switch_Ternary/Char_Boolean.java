package Day12_Recap_Scanner_Switch_Ternary;


public class Char_Boolean {
    public static void main(String[] args) {
        char ch1 = 'g';
        String result = (ch1 == 'A') ? "A is selected" : (ch1 == 'B') ? "B is selected" : (ch1 == 'C') ? "C is selected" : "Invalid";
        System.out.println(result);
    }

}
