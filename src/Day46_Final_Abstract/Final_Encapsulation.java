package Day46_Final_Abstract;


//we will check if with "private" access modifier , final can be used or not. and if we can get getter and setter methods.
public class Final_Encapsulation {

    final private int data1 = 200; //get , no set
    private int data2 = 300; //gwt, set

    public int getData1() {//read only
        return data1;
    }


    public void setData1(int data1) {
        // this.data1=data1; when give final key word any of above private data , we can create getter ,but not SETTER.
        //Because final variable cannot be reassigned.
    }

    public int getData2() {
        return data2;
    }

    public void setData2(int data2) {
        this.data2 = data2;
    }
}
