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

        System.out.println("-------------------------------------");


        Bank_Account Ahmet=new Bank_Account("Ahmet", "Mehmet");

        System.out.println(Ahmet.getAccountHolder());

        Ahmet.checkBalance();
        Ahmet.depositing(10000);
        Ahmet.checkBalance();
        Ahmet.withdrwaing(2500);
        Ahmet.checkBalance();
        System.out.println(Ahmet.toString());



    }
}
