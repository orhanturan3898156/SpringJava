package Day41_Inheritance.Task02;

public class Bank_Account {

    public long accountNumber;
    public String accountHolder;
    public double balance;

    public Bank_Account() {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void showBalance() {
        System.out.println("Available Balance: " + balance);
    }

    public String toString() {
        return "Account Holder: " + accountHolder + ", Balance: " + balance;
    }
}
