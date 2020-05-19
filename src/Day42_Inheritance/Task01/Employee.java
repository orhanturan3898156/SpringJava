package Day42_Inheritance.Task01;

public class Employee extends Person {
    /*
    name (inherited)
    age (inherited)
    gender (inherited)
    setPersonInf() (inherited)
    eat() (inherited)
    walk() (inherited)
    sleep() (inherited)
    drink() (inherited)

     */
    public double salary;
    public long employeeId;
    public String jobTitle;

    public void setEmployeeInfo(String name, int age, char gender, double salary, long employeeId, String jobTitle) {
        /*
        this.name=name;
        this.age=age;
        this.gender=gender;

         */
        setPersonInfo(name, age, gender); //instead of above, we can use "Person"'s class "setPersonInfo".
        this.salary = salary;
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }
    public String toString(){
        return "Name: "+name+
                ", ID: "+employeeId+
                ", Gender: "+gender+
                ", Salary: "+salary+
                ", EmployeeID: "+employeeId+
                ", Job Title: "+jobTitle;
    }

}
