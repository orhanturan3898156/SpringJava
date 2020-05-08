public class customer {
    String name;
    int creditscore;
    int age;
    double salary;
    boolean isEmployeed;


    public void setCustomerInfo(String name,int creditscore, double salary,boolean isEmployeed,int age){
        this.name=name;
        this.creditscore=creditscore;
        this.age=age;
        this.salary=salary;
        this.isEmployeed=isEmployeed;


    }

    public void acceptance(){
        if (age<21 || !isEmployeed){
            System.out.println("Sorry! you are not qualify for this loan");
        }

        if (age>21){
            if (creditscore<700 || salary<55000){
                System.out.println("credit score alert");
            }else {
                System.out.println("Congratulatitions");
            }
        }

    }

    public String toString(){

        return "Name: "+name+
                ", Age: "+age+
                ", Credit Score: "+creditscore+
                ", salary: $"+salary+
                ", Employed: "+isEmployeed;
    }


}
