package Day37_Constructor;

public class CyberTekSchool {
    String studentName;
    int groupNumber;
    String batch;

    static String schoolName;

    public CyberTekSchool(String studentName, int groupNumber, String batch) {
        //****>>>>>SchoolName is common for everyone.That's why no need to include here)
        schoolName = "CyberTek";
        this.studentName = studentName;
        this.groupNumber = groupNumber;
        this.batch = batch;


    }

    public String toString() {
        return "Name: " + studentName +
                ", Group Number: " + groupNumber +
                ", Batch: " + batch +
                ", School Name: " + schoolName;
    }


}

class CObjects {
    public static void main(String[] args) {
        CyberTekSchool student1 = new CyberTekSchool("Ahmet", 12, "B18");
        student1.schoolName = "MIT"; //if we do this, it will change all everyone's school name.
        System.out.println(student1);

        CyberTekSchool student2 = new CyberTekSchool("Jack", 10, "B18");
        System.out.println(student2);

        CyberTekSchool student3 = new CyberTekSchool("Chery", 2, "B18");
        System.out.println(student3);


    }
}

