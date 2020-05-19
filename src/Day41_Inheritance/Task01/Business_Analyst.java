package Day41_Inheritance.Task01;

public class Business_Analyst extends Employee {
    public Business_Analyst(String name, long id, double salary, char gender) {
        this.name = name;
        this.id = id;
        this.jobTitle = "Business Analyst";
        this.salary = salary;
        this.gender = gender;
    }

    public void writingReq() {
        System.out.println(name + " is writing requirements");
    }

    public void gathering() {
        System.out.println(name + " is gathering requirements");
    }

}
