package Day7_If_Statement_Else;



public class Eligible_To_Vote {
    public static void main(String[] args) {
        int age = 17;
        boolean citizen = true;
        boolean likeDonaldTrump = true;

        boolean eligibletoVote = (age >= 18) && (citizen == true) && (likeDonaldTrump = true);

        if (eligibletoVote) {
            System.out.println("Congratulations! You are eligible to vote.");
        }
        if (!eligibletoVote) {
            System.out.println("Sorry! You are not eligible to vote.");
        }
    }
}
