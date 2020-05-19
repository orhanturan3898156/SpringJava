package Day42_Inheritance.Task01;

import java.util.ArrayList;
import java.util.Arrays;

public class Company {
    public static Employee employee1;
    public static Employee employee2;
    public static Employee employee3;

    static {
        employee1 = new Employee();
        employee1.setEmployeeInfo("Ahmet", 23, 'M', 120000, 23425, "SDET");

        employee2 = new Employee();
        employee2.setEmployeeInfo("Irina", 45, 'F', 100000, 3346, "QA");

        employee3 = new Employee();
        employee3.setEmployeeInfo("Mahmut", 34, 'M', 110000, 7454, "QA");
    }


    public static void main(String[] args) {

        Employee[] employees={employee1,employee2,employee3};

        for (int i = 0; i <employees.length ; i++) {
            System.out.println("Name: "+employees[i].name+", ID: "+employees[i].employeeId);
        }


    }
}
