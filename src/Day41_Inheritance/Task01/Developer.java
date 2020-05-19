package Day41_Inheritance.Task01;

public class Developer extends Employee {

    public Developer( double salary,String name, long id, String jobTitle, char gender) {
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.jobTitle = jobTitle;
        this.gender = gender;
    }

    public void fixingBug() {
        System.out.println(name + " is fixing bug");
    }

    public void coding() {
        System.out.println(name + " is coding");
    }
}
