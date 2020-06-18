package Day50_Polymorphism;

public class Encapsulation {
    private String userName = "MIT";

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


}

class Test {
    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();
        System.out.println(obj.getUserName());

        obj.setUserName("CyberTek");
        System.out.println(obj.getUserName());
    }
}