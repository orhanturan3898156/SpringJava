import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class student {
    String name;
    int age;
    long idNumber;

    public void setStudentInfo(String name, int age, long idNumber) {
        this.name = name;
        this.age = age;
        this.idNumber = idNumber;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ",ID Number: " + idNumber;
    }


}

class studentObject {
    public static void main(String[] args) {
        student student1 = new student();
        student1.setStudentInfo("Ahmet", 23, 3456);

        student student2 = new student();
        student2.setStudentInfo("Mehmet", 33, 3568);

        student student3 = new student();
        student3.setStudentInfo("Yusuf", 18, 23986);


        ArrayList<student> list = new ArrayList<>();
        list.addAll(Arrays.asList(student1, student2, student3));

        list.removeIf(p -> p.age > 20);


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).name);
        }
    }
}
