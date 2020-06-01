package Day46_Final_Abstract;

public class credentials {
    final private String userName = "CyberTek";
    final private String password = "CyberTek12345";

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    //we cannot generate setter methods,because above variables are final.
    //Final cannot be reassigned.
}
