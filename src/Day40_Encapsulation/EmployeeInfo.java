package Day40_Encapsulation;

public class EmployeeInfo {
    private double salary;
    private long SSN;
    private int ID;
    private String address;

    public static String companyName = "Bank of America";

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getSSN() {
        return SSN;
    }

    public void setSSN(long SSN) {
        this.SSN = SSN;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}

class BankOfAmerica {
    public static void main(String[] args) {

        EmployeeInfo Abdul = new EmployeeInfo();

        Abdul.setAddress("123 SE Avenue New York, NY 32456");
        Abdul.setSalary(120000.60);


        System.out.println(Abdul.getAddress());
        System.out.println(Abdul.companyName);
        System.out.println(Abdul.getSalary());


    }
}
