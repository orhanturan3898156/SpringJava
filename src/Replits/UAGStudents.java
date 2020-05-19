package Replits;

public class UAGStudents {
    String name;
    int grade;
    static String principalName = "Ms. McKoy";
    String studentID;
    static int nextID = 100;

    public UAGStudents(String name, int grade) {
        this.name = name.substring(0, 1).toLowerCase() + nextID;
        this.grade = grade;
        nextID += 1;
    }

    public static void newPrincipal(String prinpicalName) {
        UAGStudents.principalName = prinpicalName;
    }

    public static void resetID() {
        nextID = 100;
    }

    public String toString() {
        return name + " " + studentID;
    }

}
