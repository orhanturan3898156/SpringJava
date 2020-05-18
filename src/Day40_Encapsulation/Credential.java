package Day40_Encapsulation;

public class Credential {

    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password; //return "*******" to hide it you can use this
    }

    public void setPassword(String password) {
        this.password = password;
    }


}

class Credential_Object {
    public static void main(String[] args) {
        Credential facebook = new Credential();

        facebook.setUserName("CyberTek");
        facebook.setPassword("School");


        System.out.println(facebook.getUserName());
        System.out.println(facebook.getPassword());
    }
}
