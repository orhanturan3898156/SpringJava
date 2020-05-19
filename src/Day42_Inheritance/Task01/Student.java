package Day42_Inheritance.Task01;

public class Student extends Person {
    /*
    Attributes: name,age,gender, studentId, class
    methods: attendClass,code, setStudentInfo,toString
     */

    /*
    name (inherited)
    age (inherited)
    gender (inherited)
    setPersonInf() (inherited)
    eat() (inherited)
    walk() (inherited)
    sleep() (inherited)
    drink() (inherited)

    we need;
    -studentId
    -class
    -attendClass()
    -code()
    -setStudentInfo()
    -toString()

     */

    public long studentId;
    public String clazz;
    public static String schoolName="CyberTek";

    public void setStudenInfo(String name, int age, char gender, long studentId, String clazz) {
        setPersonInfo(name, age, gender);
        this.studentId = studentId;
        this.clazz = clazz;
    }

    public void attendClass() {
        System.out.println(name + " is attending " + clazz);
    }

    public void code() {
        System.out.println(name + " is coding");


    }

    public String toString(){
        return  "Name: "+name+
                ", ID: "+studentId+
                ", Age:"+age+
                ", Gender: "+gender+
                ", Class: "+clazz+
                ", School Name: "+schoolName;

    }





}
