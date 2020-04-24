package Day8_Multi_Branch_If_Statement;

public class More_Example {
    public static void main(String[] args) {
        double note = 45;
        boolean GradeA = note >= 90;
        boolean GradeB = note < 90 && note >= 80;
        boolean GradeC = note >= 70 && note < 80;
        boolean GradeD = note >= 60 && note < 70;


        /*if (GradeA){
            System.out.println("Your Grade: A");
        } else if (GradeB){
            System.out.println("Your Grade: B");
        }else if (GradeC){
            System.out.println("Your Grade: C");
        }else if (GradeD){
            System.out.println("Your Grade: D");
        }
        else {
            System.out.println("Your Grade:F");
        }*/
        System.out.println("=====================================");

        //another solution for this example

        char grade = ' ';
        if (GradeA) {
            grade = 'A';
        } else if (GradeB) {
            grade = 'B';
        } else if (GradeC) {
            grade = 'C';
        } else if (GradeD) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Your grade is: " + grade);
    }
}
