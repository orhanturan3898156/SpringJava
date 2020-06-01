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

        System.out.println("===================================================================");
        int a = 200; // 199
        int b = -a++ +  - --a *  a-- % 2;
        // b =  -200  +  -200  * 200 % 2
        //  b =  -200 + -40000  %  2
        //  b =  -200 + 0
        // b = -200;

        System.out.println(b);//-200
        System.out.println(a);//199

        int x = 300;
        int y = 400;
        int z =  x  +   y   -  x * y + x / y;
        //  z = 300 +  400  - 300 * 400 + 300 / 400
        // z = 300 + 400 - 120000 + 300 / 400             300/400 ==> 0.75;
        // z = 300 + 400 - 120000 + 0
        // z = 700 - 120000 = -119300

        System.out.println(z);






    }
}
