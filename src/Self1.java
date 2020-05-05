public class Self1 {
    public static void main(String[] args) {

        Self  customer1=new Self();
        customer1.customerInfo("Anna Karanina",1234567,2000);
        System.out.println(customer1);

        customer1.checkBalance();
        customer1.deposit(120);
        customer1.checkBalance();
        customer1.withdraw(2119);
        //customer1.checkBalance();
        customer1.checkBalance();




        System.out.println("=========================================================");

        Self customer2=new Self();

        customer2.accountHolder="Bekir Aslan";
        customer2.accountNumber=34323110;
        customer2.balance=300000;

        customer2.customerInfo("Bekir Aslan",34323110,300000);

        System.out.println(customer2);


    }
}
