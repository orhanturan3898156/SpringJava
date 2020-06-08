package Day47_Abstraction;

public class FireFox_Driver extends Remote_WebDriver {

    @Override
    protected void get(String URL) {
        System.out.println("Opening " + URL + " in the FireFox Driver");
    }

    @Override
    public void quit() {
        System.out.println("Closing the FireFox Browser");
    }
}
