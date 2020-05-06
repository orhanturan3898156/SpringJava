package Office_Hours.Practice_05_06_2020_CustomClass;

public class Tester {
    String name;
    String jobTitle;
    double salary;
    long employeeId;

    public void setTesterInfo(String name, String jobTitle, double salary, long employeeId) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.employeeId = employeeId;

    }

    public String toString() {
        return "Name: " + name + ", Job Title: " + jobTitle
                + ", Salary: $" + salary + ", Employee ID: " + employeeId;
    }

    public void smokeTesting() {
        System.out.println(name + " is doing Smoke Testing");
    }

    public void creatingTicket() {
        System.out.println(name + " is creating ticket on Jira");
    }
}
