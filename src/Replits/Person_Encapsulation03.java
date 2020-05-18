package Replits;

public class Person_Encapsulation03 {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person_Encapsulation03() {
        this.firstName = "undefined";
        this.lastName = "undefined";
        this.age = -1;
    }
    public Person_Encapsulation03(String firtName,String lastName, int age){
        this.firstName=firtName;
        this.lastName=lastName;
        this.age=age;
    }

    public String toString() {
        return firstName + " | " + lastName + " | " + age;
    }


}

class testNow {
    public static void main(String[] args) {
        Person_Encapsulation03 person = new Person_Encapsulation03();

        System.out.println(person.getFirstName());
        System.out.println(person.getAge());
    }
}
