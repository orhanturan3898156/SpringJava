package Day34_Custom_Class;

import java.util.ArrayList;
import java.util.Arrays;

public class Student_Object {
    public static void main(String[] args) {

        Student student1 = new Student();
        // System.out.println(student1.name); >>>null

        student1.setStudentInfo("Adam", "England", 34, 3.5, 'M', true);
        //System.out.println(student1);>>gives hashcode,because we havent initiazlized the toString method yet
        System.out.println(student1);

        Student student2 = new Student();
        student2.setStudentInfo("Mike", "German", 30, 3.0, 'M', false);
        System.out.println(student2);

        Student student3 = new Student();
        student3.setStudentInfo("Johanny", "US", 40, 2.5, 'M', false);
        System.out.println(student3);

        Student student4 = new Student();
        student4.setStudentInfo("Anna", "Ukraninan", 33, 3.9, 'F', true);
        System.out.println(student4);


        Student[] students = {student1, student2, student3, student4};

        ArrayList<Student> canGraduate = new ArrayList<>(Arrays.asList(students));

        canGraduate.removeIf(p -> p.gpa <= 3);
        System.out.println(canGraduate.size());
        for (int i = 0; i < canGraduate.size(); i++) {
            Student each = canGraduate.get(i);
            System.out.println(each.name +", "+each.gpa+ " can graduate");


        }
        System.out.println("===================================================");


        ArrayList<Student> cannotGraduate = new ArrayList<>(Arrays.asList(students));

        cannotGraduate.removeIf(p -> p.gpa > 3.0);
        System.out.println(cannotGraduate.size());
        for (int j = 0; j < cannotGraduate.size(); j++) {
            Student each2 = cannotGraduate.get(j);
            System.out.println(each2.name + " cannot graduate");

        }

    }

}
