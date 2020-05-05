package Day33_Custom_Class_Intro;

public class BankAccount {
    /*
    Attributes:Accountholder,accountnumber,balance
    actions:ChckingBalance,withdraw,deposit

     */



    /*
    create a custom class for BankAccount
      attributes/data that can have are:
      1. AccountHolder, 2. AccountNumber, 3. Balance
         Actions: showBalance, deposit, withdraw
         requiremnts:
         1. user should be able to deposit money into their account
         2. user should be able to withdraw money from their account
         2.1 if the withdrawing account is greater than available balance, 35$ penalty charge will be added
         2.2 if the balance is less than or equal to 0, user should not be able to withdraw money
         3. user should be able to see their balance
     */

    String accountHolder;
    long accountNumber;
    double balance;

    public void checkingBalance(){
        System.out.println("Available balance: "+balance);
    }
    public void withdraw(double amount){
        System.out.println("Withdrawing $"+amount);
       balance-=amount;
    }
    public void deposit(double amount){
        System.out.println("Depositing $"+amount);
        balance+=amount;
    }
    public String toString(){
        String result="Account Holder: "+accountHolder+"\nAccountNumber: "+accountNumber+"\nAvailable Balance: "+balance;
        return result;
    }


}
