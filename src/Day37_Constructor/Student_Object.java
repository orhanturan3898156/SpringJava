package Day37_Constructor;

public class Student_Object {
    public static void main(String[] args) {

        /*  >>normal way we did
        Student student1 = new Student();
        student1.setInfo("Ahmet", 34, 'M', "Harward");

        System.out.println(student1);

         */

        //this helps us to not call set info again and again.

        Student student1=new Student("Ahmet", 34, 'M', "Harward");
        System.out.println(student1);

        Student student2=new Student("Ali",23,'M',"Stanford");
        System.out.println(student2);

        System.out.println("=======================================");


    }
}
