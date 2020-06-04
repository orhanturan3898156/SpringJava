package Replits.If_Statements;

public class If_Statement_Grade {
    /*
    an automated test also needs a way to grade students.

    in this assignment you will get a grade int and using ifs output if its a passing grade or failure.

    if grade is bigger then 90 output "excellent"

    if the grade is bigger then 70 and smaller then 90 output "good"

    if grade is bigger then 60 and smaller then 70 output "pass"

    if grade is smaller then 60 output "fail"

    hint: && is the operator for and in java.
     */
    public static void main(String[] args) {

        int grade = 100;
        String result = "";

        if (grade <= 100 && grade >= 0) {

            if (grade > 90) {
                result = "Excellent";
            } else if (grade < 90 && grade >= 70) {
                result = "Good";
            } else if (grade < 70 && grade >= 60) {
                result = "Pass";
            } else {
                result = "fail";
            }


        } else {
            result = "Invalid";
        }
        System.out.println(result);

        System.out.println("========================================");

    }
}