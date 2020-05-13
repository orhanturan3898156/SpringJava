package Office_Hours.Practice_05_13_2020_Review_Instance_Static_Constructor;

public class Student {

    String name;
    long id;
    static String schoolName = "Cybertek"; //we use static for common.

    public String toString() {
        return "Name: " + name + ", ID: " + id+", School Name: "+schoolName;
    }
    public void printSchoolName(){
        System.out.println(schoolName+" School");
    }
}

class studentObjects {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Mahmut";
        student1.id = 5343;

        Student student2 = new Student();
        student2.name = "Ali";
        student2.id = 123;

        System.out.println(student1);
        System.out.println(student2);

    }
}
