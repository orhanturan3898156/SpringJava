package Day39_Acces_Modifier;

public class Employee {
    /*
     create a class called Employee:
     instance variables:
     name, jobTitle, ID, salary
     add a constructor that can initialize name of employee
     add a constructor that can initialize name, jobTitle of the employee
     (apply constructor call to initialize the name)
     add a constructor that can initialize name, jobTitle, ID of the employee
     (apply constructor call to initialize the name and jobTitle)
     add a constructor that can initialize name, jobTitle, ID, salary of employee
     (apply constructor call to initialize the name, jobTitle, ID)
      add toString method
     */
    String name;
    String jobTitle;
    long ID;
    double salary;
    char gender;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, String jobTitle) {
        this(name);
        this.jobTitle = jobTitle;
    }

    public Employee(String name, String jobTitle, long ID) {
        this(name, jobTitle);
        this.ID = ID;
    }

    public Employee(String name, String jobTitle, long ID, double salary) {
        this(name, jobTitle, ID);
        this.salary = salary;
    }

    public Employee(String name, String jobTitle, long ID, double salary, char gender) {
        this(name, jobTitle, ID, salary);
        this.gender = gender;
    }

    public String toString() {
        return "Name: " + name +
                ", Job Title: " + jobTitle +
                ", ID: " + ID +
                ", Salary: " + salary +
                ", Gender: " + gender;

    }
}

class employeeObject {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Rustem");
        System.out.println(employee1);

        System.out.println("=================================================");

        Employee employee2 = new Employee("Ahmet", "SDET");
        System.out.println(employee2);

        System.out.println("=================================================");

        Employee employee3 = new Employee("Mahmut", "SDET", 497383);
        System.out.println(employee3);

        System.out.println("=================================================");

        Employee employee4 = new Employee("Jack", "QA", 389289, 120000);
        System.out.println(employee4);

        System.out.println("=================================================");

        Employee employee5 = new Employee("John", "QA", 3102394, 130000, 'M');
        System.out.println(employee5);


    }
}
