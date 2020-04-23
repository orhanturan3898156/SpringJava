package Day6_Shorthand_LogicalOperators_IfStatement;
public class Replit_Questions {
    public static void main(String[] args) {

        int a = 5;
        int b = 7;
        if (b > a) {

            System.out.println(b + " is greater");
        }
        System.out.println("=============================");
        int num = 1;
        if (num > 0) {
            System.out.println("positive");
        }
        if (num < 0) {
            System.out.println("negative");

        }
        if (num == 0) {
            System.out.println("zero");

        }
        System.out.println("===========================");
        int grade = 75;
        if (grade > 90) {

            System.out.println("Excellent");

        }
        if (grade > 70 && grade < 90) {
            System.out.println("good");
        }
        if (grade < 60) {
            System.out.println("fail");
        }
        System.out.println("============================");
        int n1 = 2;
        int n2 = 3;
        int n3 = 4;
        if (n1 > n2 && n1 > n3) {
            System.out.println("n1 is biggest");
        }
        if (n2 > n1 && n2 > n3) {
            System.out.println("n2 is biggest");
        }
        if (n3 > n1 && n3 > n2) {
            System.out.println("n3 is biggest");
        }

    }
}
