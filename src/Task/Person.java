package Task;

public class Person {
    public String firstName;
    public String lastName;
    private long SSN;
    private long ID;

    public void setInfor(String firstName,String lastName,long SSN,long ID){
        this.firstName=firstName;
        this.lastName=lastName;
        this.SSN=SSN;
        this.ID=ID;
    }
    public long getSSN(){
        return SSN;
    }
    public void setSSN(long SSN){
        this.SSN=SSN;
    }
    public long getID(){
        return ID;
    }

    public void setID(long ID){
        this.ID=ID;
    }

    public String toString(){
        return  "First Name: "+firstName+
                ", Last Name: "+lastName+
                ", SSN: "+SSN+
                ", ID: "+ ID;
    }

}
