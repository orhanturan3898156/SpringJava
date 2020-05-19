package Day41_Inheritance.Task01;

public class Tester extends Employee {
    /*
    we currently have name,salary,job title,gender,id are inherited.
     */

    public Tester(String name, double salary, long id, String jobTitle, char gender) {
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.jobTitle = jobTitle;
        this.gender = gender;
    }

    public void reporting() {
        System.out.println(name + " is reporting a bug");
    }

    public void testing() {
        System.out.println(name + " is testing");
    }


}
