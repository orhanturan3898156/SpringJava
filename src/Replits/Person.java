package Replits;

public class Person {
    /*
    Create the a Person class with the following:

instance Variables
String firstname
String lastname
int birthmonth
int birthday
int birthyear
String ssn
All variables above should be private.

Constructor
The main constructor should take in all values and assign them to their respective private class variables

Methods
Create a public getters and setters for firstname and lastname:
getFirstname
getLastname
setFirstname
setLastname

Create a public getter method called getBirthday, which will return a String composed of their birthday in month/day/year format.
For example, if birthmonth=3, birthday=22, birthyear=2000, it should return the String "3/22/2000"

Create a public method called verifySSN that takes in a String parameter and returns a boolean.
It will check the parameter against the person's SSN and return true or false based on whether they match.

Complete the questions on Classroom.
     */

    private String firstname;
    private String lastname;
    private int birthmonth;
    private int birthday;
    private int birthyear;
    private String ssn;

    public Person(String firstname, String lastname, int birthmonth, int birthday, int birthyear, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthmonth = birthmonth;
        this.birthday = birthday;
        this.birthyear = birthyear;
        this.ssn = ssn;

    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    /*
    public int getBirthmonth() {
        return birthmonth;
    }

    public int getBirthday() {
        return birthday;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public String getSsn() {
        return ssn;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String firstname, String lastname) {

        this.lastname = lastname;
    }

    public void setBirthmonth(int birthmonth) {
        this.birthmonth = birthmonth;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    */

    public String getBirthday() {
        //String "3/22/2000"
        return birthmonth + "/" + birthday + "/" + birthyear;
    }

    /*
    create a public method called verifySSN that takes in a String parameter and returns a boolean.
It will check the parameter against the person's SSN and return true or false based on whether they match.
     */
    public boolean verifySSN(String str) {

        return ssn == str;
    }


}
