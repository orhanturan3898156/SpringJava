package Day41_Inheritance;

public class Bank_Account {
/*
create costum class called BankAccount for Bank of America' bank accounts:
public variables:  bankName, firstName, lastName
 private variables: accountHolder, accountNumber, balance
 encapsulate all the private data
 (DO NOT USE SHORTCUT)
 create a constructor that can initialize firstName and fullName
 (DO NOT USE SHORTCUT)
 action:
 depositing
 withdrawing
 availablebalance
 toString: returns the full name and balance
 */

    public static String bankName = "Bank of America";
    public String firstName;
    public String lastName;

    private String accountHolder;
    private long accountNumber;
    private double balance;

    public Bank_Account(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountHolder = firstName + " " + lastName;

    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String firstName, String lastName) {
        this.accountHolder = firstName + " " + lastName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void depositing(int amount) {
        // balance += amount; //this works ,we can also use below one.
        setBalance(balance + amount);
    }

    public void withdrwaing(int amount) {
        //balance-=amount;  this works ,we can also use below one.
        //when local variable and parameter name is different , we dont need to use "this" key word.
        setBalance(balance - amount);
    }

    public void checkBalance() {
        //System.out.println("Available Balance: " + balance);
        System.out.println("Available Balance: " + getBalance());
    }

    public String toString() {
        return "Full Name: " + getAccountHolder() +
                ", Available Balance: " + getBalance();

    }
}
