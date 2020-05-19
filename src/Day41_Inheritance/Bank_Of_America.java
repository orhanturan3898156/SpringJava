package Day41_Inheritance;

public class Bank_Of_America {
    public static void main(String[] args) {
        Bank_Account Irina=new Bank_Account("Irina","Li");

        System.out.println(Irina.getAccountHolder());
        System.out.println(Irina.getBalance());

        Irina.checkBalance();
        Irina.depositing(120);
        Irina.checkBalance();
        Irina.withdrwaing(80);
        Irina.checkBalance();

        System.out.println(Irina);


    }
}
