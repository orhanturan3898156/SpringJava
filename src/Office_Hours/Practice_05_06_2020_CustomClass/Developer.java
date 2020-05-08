package Office_Hours.Practice_05_06_2020_CustomClass;

public class Developer {

    String name;
    String jobTitle;
    double salary;
    long employeeId;

    public void setDevInfo(String name, String jobTitle, double salary, long employeeId) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.employeeId = employeeId;

    }

    public String toString() {
        return "Name: " + name + ", Job Title: " + jobTitle
                + ", Salary: $" + salary + ", Employee ID: " + employeeId;
    }

    public void coding() {
        System.out.println(name + " is doing coding");
    }

    public void fixingBugs() {
        System.out.println(name + " is fixing bugs on Jira");
    }
}



