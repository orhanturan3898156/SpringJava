package Day33_Custom_Class_Intro;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount Anna = new BankAccount();
        Anna.accountHolder = "Anna";
        Anna.accountNumber = 123456;

        Anna.checkingBalance();
        Anna.deposit(33);
        Anna.checkingBalance();
        Anna.withdraw(13);
        Anna.checkingBalance();
        Anna.withdraw(30);
        Anna.checkingBalance();
        Anna.withdraw(1000);
        Anna.checkingBalance();
        System.out.println("=======================================");
        System.out.println(Anna);

    }
}
