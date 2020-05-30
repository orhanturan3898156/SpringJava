package Day40_Encapsulation;

public class Encapsulation {
    /*
    OOP Principles
    -Encapsulation : means in Java " hiding DATA"
    Steps to apply;
    1.hide data by giving private access modifier
    2.use the private data through getter and setter
    getter is for "read only"
    setter helps to "modify"


    getter():it is public instance method.Return type will be same with what you give.if int, you return int ...
    **** Example: public double getInfo(){
    return double instanceVariable;


    setter(): it is public instance method. Return type is VOID. pass parameter
    //                          it can be any data type.must match with data type
    **** Example: public void getInfo(String str){
    this.str=str;

    }


    }



     */
    //there is no direct access to private data,but the methods
    private long SSN;


    //we need "getter".it is used for private data
    //get is for "read only"

    public long getSSN() {
        return SSN;
    }

    //setter helps to "modify"
    //setter is for "Write only"
    public void setSSN(long SSN) {
        this.SSN = SSN;
    }




    //if we delete public,we cannot call them in another package.
    //check "Resources-Encapsulation_Test"


}
