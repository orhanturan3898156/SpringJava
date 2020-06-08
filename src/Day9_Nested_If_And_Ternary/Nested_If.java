package Day9_Nested_If_And_Ternary;

public class Nested_If {
    public static void main(String[] args) {
        //if the condition can be evaliated to multiple scenario.
        //if we have pre-condition
        /*Nested If: if the condition can be evaluate to multiple scenario
            
            if we have precondition
            if(pre-condition){
                    statementA
                if(Condition1){
                    statementB
                }
            }
        statementA: only if precondition is true
        only statementA: if precondition is true, condition1 is false
        statementB: if precondition is tre, and condition1 is true
        only statementB: impossible*/

        boolean citizenship = true;
        int age = 14;

        if (citizenship) {
            if (age > 17) {
                System.out.println("Eligible");
            } else {
                System.out.println(" Must be 18 and over");
            }

        } else {
            System.out.println("only the US citizens are eligible to vote ");

        }
        System.out.println("\n==================================================");

        int score = -2;
        String grade = " ";
        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else {
                grade = "Fail";
            }
            System.out.println(grade);

        } else {
            System.out.println("Invalid");
        }
        System.out.println("\n==================================================");

        //above example with Ternary
        int score1 = 392;

        String grade1 = " ";

        if (score1>=0 && score1<=100){
            grade1=(score1>=90)? "A" :(score1>=80)? "B" :(score1>=70)? "C" :(score1>=60)? "D" :"Fail";

        }else {
            grade1="Invalid";
            System.out.println(grade1);
        }


    }
}
