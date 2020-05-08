package Day35_Static;

public class Student_Objects {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "Muhtar";
        System.out.println(student1);


        Student student2 = new Student();
        student2.name = "Kuzzat";
        System.out.println(student2);

        Student.printSchoolName();

        /// IMPORTATNT
        // mesela test case leri check ederken ,browser i chrome,
        // Edge diye static le assign edebilirisn.boylece hep chrome,edge uzerinden yapar

    }
}
