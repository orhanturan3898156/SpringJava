package Day9_Nested_If_And_Ternary;



public class Age_Group_Nested_If {
    public static void main(String[] args) {
        int age = 56;
        String ageGroup = " ";
        if (age > 0 && age < 150) {
            ageGroup=(age<21)? "Teenager" :(age>21 && age<55)? "Adult" : "Senior";

        } else {
            ageGroup = "Not Found";
        }
        System.out.println(ageGroup);


    }
}
