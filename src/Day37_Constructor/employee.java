package Day37_Constructor;

public class employee {
    /*
    Create a class
     */
    String name;
    long id;
    long ssn;
    String jobTitle;
    double salary;
    char gender;

    public void setInfo(String name, long id, long ssn, String jobTitle, double salary, char gender) {
        this.name = name;
        this.id = id;
        this.ssn = ssn;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;

    }

    public String toString(){
        return "Name: "+name+
                ", ID: "+id+
                ", SSN: "+ssn+
                ", Job Title: "+jobTitle+
                ", Salary: "+salary+
                ", Gender: "+gender;
    }
}
