public class Self {



    String accountHolder;
    long accountNumber;
    double balance;

    public void checkBalance(){
        System.out.println("Available balance is :$"+balance);
    }
    public void withdraw(double amount){


        if (balance<0){
            System.out.println("Sorry! You cannot withdraw money");
        }else if (balance>0 && amount>balance){
            if (balance>-100){
                System.out.println("sorry too much fund");
            }else {
                balance-=amount+35;
            }

        }else {
            balance-=amount;
        }



    }
    public void deposit(double amount){
        balance+=amount;

    }

    public void customerInfo(String customerName,long customerAccountNumber,double customerBalance){
        accountHolder=customerName;
        accountNumber=customerAccountNumber;
        balance=customerBalance;
    }

    public String toString(){
        String result="Account Holder: "+accountHolder+"\n"+"Account Number: "+accountNumber+"\n"+"Balance: $"+balance;
        return result;
    }






}
