package Day41_Inheritance.Task02;

public class Checking_Account extends Bank_Account {


    public void withdraw(int amount) {
        balance -= amount;
    }
}
