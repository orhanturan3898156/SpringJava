package Day42_Inheritance.Task01;

import java.util.ArrayList;
import java.util.Arrays;

public class School {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudenInfo("Bahtiyar", 35, 'M', 1245, "Testing");

        Student student2 = new Student();
        student2.setStudenInfo("Abide", 32, 'F', 6465, "Art");

        Student student3 = new Student();
        student3.setStudenInfo("Baykal", 10, 'M', 6356, "Soccer");


        ArrayList<Student> studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(student1, student2, student3));

        for (Student each : studentList) {
            System.out.println(each);
        }


    }
}
