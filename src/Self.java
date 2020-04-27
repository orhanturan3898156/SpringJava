import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;


public class Self {
    public static void main(String[] args) {

        String letters = "AABBCCCDDDE";
        char c = 'C';
        unique(letters);


    }

    public static void unique(String str) {

        for (int j=0;j<str.length();j++) {
            String result = "";
            int count = 0;
            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;

                }
            }
            if (count == 1) {
                result += str.charAt(j);
            }
            System.out.print(result);

        }


    }


}