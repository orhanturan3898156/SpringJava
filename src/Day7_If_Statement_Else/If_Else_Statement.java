package Day7_If_Statement_Else;

public class If_Else_Statement {

    public static void main(String[] args) {
        //you can give only one else condition!
        // it is used only if there are two conditions/posibilities
        double number = -4;
         /*if(number>=0){
             System.out.println(number + " is a positive number");

         }
         if (number<0){
             System.out.println(number+" is a negative number");
         }*/

        if (number >= 0) {
            System.out.println(number + " is a positive number");

        } else {
            System.out.println(number + " is a negative number");
        }
        System.out.println("\n=========================================\n");

        int number1 = 101;
        if (number1 % 2 == 0) {
            System.out.println(number1 + " is a even number");

        } else { // you don't need to write condition again for "else".
            System.out.println(number1 + " is a odd number");
        }
        System.out.println("\n==============================\n");

        int age = 30;
        boolean eligibility = age >= 21;
        if (eligibility) {
            System.out.println("Eligible to buy !");
        } else {
            System.out.println("Not Eligible to buy!");
        }
        System.out.println("\n==============================\n");
        boolean testedPositive = false;
        if (testedPositive) {
            System.out.println("See doctor");
        } else {
            System.out.println("Stay safe\tdo more coding");
        }
    }
}
