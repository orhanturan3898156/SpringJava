package Day9_Nested_If_And_Ternary;

public class Ternary2 {
    public static void main(String[] args) {
        String result=" ";
        if(9>10){
            result=" 9 is greater";
        }   else {
            result="10 is greater";
        }
        String result2= (9>10)? "9 is greater" : "10 is greater";
        System.out.println(result);
        System.out.println(result2);
        System.out.println("==================================================================\n");

        int age=20;
        boolean eligibility=(age>=21)? true : false;
        System.out.println(eligibility);
        System.out.println("==================================================================\n");

        int ageOfPErson=13;
        String eligibileToVote=(ageOfPErson>=18)? "Can vote" : "Can not Vote";
        System.out.println(eligibileToVote);





    }
}
