package Day41_Inheritance.Task02;

public class Account_Objects {
    public static void main(String[] args) {
        Checking_Account obj = new Checking_Account();

        obj.accountHolder = "Mustafa";
        obj.deposit(25000);
        obj.showBalance();
        obj.withdraw(10000);
        obj.showBalance();
        System.out.println(obj);

        System.out.println("================================================");

        Saving_Account obj2 = new Saving_Account();
        obj2.accountHolder = "Elif";

        System.out.println(obj2.interestRate); //interestRate is static. we can either call it through class name or object.

        System.out.println(obj2);

        obj2.deposit(3000);
        obj2.showBalance();

        //obj2.withdraw()// we cannot call withdraw. beacuse it doesnt include in it.

    }
}
