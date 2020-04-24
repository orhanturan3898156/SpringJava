package Office_Hours.Practice_03_18_2020;
public class Logical_Operators_Practice {
    public static void main(String[] args) {
        boolean r1 = "Muhtar" == "Bad Guy";
        System.out.println(r1);
        boolean r2 = "Muhtar" != "Good Guy";
        System.out.println(r2);

        boolean r3 = !false == !true;
        System.out.println("========================");
        // || as long as one condition is true it returns "true"
        // && as long as one condition is false, it will return 'false'
        boolean result1 = 9 != 10 || 9 == 8;
        System.out.println(result1);
        System.out.println("========================");

        boolean result2 = 'a' == 'A' || 'A' == 'b';
        System.out.println(result2);

        boolean result3 = 6 > 5 && 6 < 4;
        System.out.println(result3);

    }
}
