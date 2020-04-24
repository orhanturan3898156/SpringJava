package Day8_Multi_Branch_If_Statement;

public class WarmUp {
    public static void main(String[] args) {
        double n1 = 200.5;
        double n2 = 200.5;
        double n3 = 200.5;
        if (n1 == n2 && n1 != n3) {
            System.out.println(n1 + " is equal to " + n2);
        }
        if (n2 == n3 && n2 != n1) {
            System.out.println(n2 + " is equal to " + n3);
        }
        if (n1 == n2 && n1 == n3) {
            System.out.println("all of them equal ");
        }
        if (n1 != n2 && n2 != n3 && n1 != n3) {
            System.out.println("none of them is equal");
        }
        if (n2 == n3 && n2 != n1) {
            System.out.println("only n2=n3");
        }

    }
}
