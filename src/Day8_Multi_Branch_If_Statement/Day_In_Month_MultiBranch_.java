package Day8_Multi_Branch_If_Statement;


public class Day_In_Month_MultiBranch_ {
    public static void main(String[] args) {
        byte month = 13;
        boolean days28 = month == 2;
        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11;
        boolean days31 = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;

        String result = " ";
        if (days28) {
            result = "month has 28 days";
        } else if (days30) {
            result = "month has 30 days";
        } else if (days31) {
            result = "month has 31 days";
        } else {
            result = "Invalid Entry";
        }
        System.out.println(result);

    }
}
