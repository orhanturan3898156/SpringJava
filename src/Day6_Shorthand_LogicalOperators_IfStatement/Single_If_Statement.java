package Day6_Shorthand_LogicalOperators_IfStatement;

public class Single_If_Statement {
    public static void main(String[] args) {

        boolean coldWeather = true;
        if (coldWeather) {

            System.out.println("Wear your Coat");
            System.out.println("Wear your jacket");

        }

        boolean coronaDetected = true;
        if (coronaDetected) {
            System.out.println("Buy more toilet paper");
            System.out.println("Stay at Home");


        }
        System.out.println("====================================");
        int a = 201; //if you put 101 ,it is not going to give anything.
        boolean evenNumber = a % 2 == 0;
        //boolean oddNumber = a % 2 != 0;
        if (evenNumber) {

            System.out.println(a + " is even number");

        }

        if (!evenNumber) {
            System.out.println(a + " is odd number");
        }

    }
}
