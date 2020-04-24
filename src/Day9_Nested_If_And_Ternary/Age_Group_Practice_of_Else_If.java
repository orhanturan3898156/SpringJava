package Day9_Nested_If_And_Ternary;

public class Age_Group_Practice_of_Else_If {
    public static void main(String[] args) {
        int age = 180;
        String ageGroup = " ";
        if (age < 3 && age > 0) {
            ageGroup = "Baby";
        } else if (age >= 3 && age <= 5) {
            ageGroup = "Toddler";
        } else if (age >= 6 && age <= 9) {
            ageGroup = "Kid";
        } else if (age >= 10 && age <= 12) {
            ageGroup = "Pre-Teen";
        } else if (age >= 13 && age <= 17) {
            ageGroup = "Teenager";
        } else if (age >= 18 && age <= 20) {
            ageGroup = "Young Adult";
        } else if (age >= 21 && age <= 39) {
            ageGroup = "Adult";
        } else if (age >= 40 && age <= 49) {
            ageGroup = "Young Middle Age Adult";
        } else if (age >= 50 && age <= 54) {
            ageGroup = "Mid Age Adult";
        } else if (age >= 55 && age <= 64) {
            ageGroup = "Very Young Senior Citizen";
        } else if (age >= 65 && age <= 74) {
            ageGroup = "Young Senior Citizen";
        } else if (age >= 75 && age <= 84) {
            ageGroup = "Senior Citizen";
        } else if (age >= 85 && age <= 150) {
            ageGroup = "Old Citizen";
        } else {
            ageGroup = "Invalid";
        }
        System.out.println(ageGroup);
        boolean eligibleToBuy = ageGroup == "Adult" || ageGroup == "Young Middle Age Adult" || ageGroup == "Mid Age Adult";
        if (eligibleToBuy) {
            System.out.println("You are eligible");
        } else {
            System.out.println("Not Eligible");



        }

    }
}
