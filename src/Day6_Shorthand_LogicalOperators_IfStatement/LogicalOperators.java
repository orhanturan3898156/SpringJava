package Day6_Shorthand_LogicalOperators_IfStatement;

public class LogicalOperators {
    public static void main(String[] args) {

        //logical operators can apply to boolean expression
        //!: logical oppsoite operators
        //!true=false
        //!false=true

        boolean result1 = true;
        System.out.println(!result1);
        boolean result2 = !(10 + 15 > 15);
        System.out.println(!result2);

        boolean result3 = !true == !false;
        System.out.println(result3);
        System.out.println("=======================================");

        //And Logic: &&
        boolean R1 = "Corona Virus" != "End of the World" && "Toilet Paper" == "Cure";
        System.out.println(R1);

        boolean R2 = 10 > 15 && 15 < 13;
        System.out.println(R2);
        System.out.println("=========================================");

        //||: or logic
        //true||false==>true
        //false||true==>true
        //true||true==>true
        //false||false==>false
        boolean R4 = true != false || false == !true;
        System.out.println(R4);

        boolean R5 = true != false && !false == !!true;
        System.out.println(R5);


    }
}
