package Day21_Arrays;

public class For_Each_Loop_Practice1 {
    public static void main(String[] args) {
        /*
        ask:
        given an array:
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"}
        elemnts could be more in the array
        print all the email addresses excluding the gmail addresses
        NOTE: MUST USE FOR EACH LOOP
         */

        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"};
        for (String each : emails) {
            if (each.endsWith("@gmail.com")) {
                continue;
            }
            System.out.println(each);
        }


    }
}
