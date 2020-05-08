package Day35_Static;

public class Student {
    String name;
    long id;
    double gpa;

    static String schoolName = "CyberTek";

    public void setInfo(String name, long id, double gpa) { //we wrote static first ,but compile error.beacuse static cannot call through instance variable
        this.name = name;
        this.id = id;
        this.gpa = gpa;


    }

    public static void printSchoolName() {
        System.out.println("School Name is: " + schoolName);
    }

    public String toString() { // bu static olamaz.ama static variable kullanabilirsin.

        return "Name: " + name +
                ", School Name: " + schoolName;


    }


}
