package Office_Hours.Practice_05_13_2020_Review_Instance_Static_Constructor;

import java.lang.annotation.Native;

public class Constructor {
    public Constructor() { //you can remove the public as well.it will still works.
        System.out.println("default constructor");

    }

    public static void main(String[] args) {
        //constructor is a special method
        Constructor obj = new Constructor(); //this is default constructor.
        //1. Constructor's name must be same with class name
        //it might either have or not parameter.

    }
}

class Employee {
    String name;
    long ID;
    double salary;

    public Employee(String name, long ID, double salary) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;
    }

    public String toString() {
        return "Name: " + name +
                ", ID: " + ID + ", Salary: $" + salary;
    }


}

class employeeObject {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Orhan", 234, 123456);
        System.out.println(employee1.name);
        System.out.println(employee1.ID);
        System.out.println(employee1.salary);
        System.out.println(employee1);
    }
}

