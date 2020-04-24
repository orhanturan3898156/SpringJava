package Day9_Nested_If_And_Ternary;

public class Ternary_Practice {
    public static void main(String[] args) {
        int number = 10;
        char ch1 = ' ';
        if (number > 0) {
            ch1 = '+';
        } else if (number < 0) {
            ch1 = '-';
        }else {
            ch1='0';
        }
        System.out.println(ch1);

        char ch2=(number>0)? '+' :(number<0)? '-' : '0';
        System.out.println(ch2);

        System.out.println("\n=============================================================");
        byte score=10;
        String grade=" ";
        if (score>=90 && score<=100){
            grade="Excellent";
        }else if(score>=80 && score>90){
            grade="Grade";
        }else if (score>=70 && score<80){
            grade="Good";

        }else if (score>=60 && score<70){
            grade="Pass";
        }else if (score<60 && score>0){
            grade="Fail";
        }else {
            grade="Invalid";
        }
        System.out.println(grade);

        String grade2=(score>=90 && score<=100)? "Excellent" :(score>=80 && score>90)? "Great" :(score>=70 && score<80)? "Good" :(score>=60 && score<70)? "Pass" :(score<60 && score>0)? "Fail" : "Invalid";
        System.out.println(grade2);
    }
}
