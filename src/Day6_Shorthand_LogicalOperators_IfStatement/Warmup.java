package Day6_Shorthand_LogicalOperators_IfStatement;

public class Warmup {

    public static void main(String[] args) {

        double numberofGallons=1;
        double gallonstoLiters=numberofGallons*3.785;
        String result=numberofGallons + " gallons" + " is equal to: " + gallonstoLiters + " liters";
        System.out.println(result);
        System.out.println("========================================");

        double numberofLiters=100;
        double litersToGallons=numberofLiters/3.785;
        String result2= numberofLiters + " liters" + " equals to " + litersToGallons + " gallons";
        System.out.println(result2);

        System.out.println("=========================================");

        int a=200;  //200
        int b= -a++ + - --a*a--%2;
        // -200 + -200*200%2;
        System.out.println(b);





    }
}
