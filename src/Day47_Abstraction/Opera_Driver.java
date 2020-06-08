package Day47_Abstraction;

public class Opera_Driver extends Remote_WebDriver {

    @Override
    public void get(String URL) {
        System.out.println("Opening " + URL + " in the Opera Driver");
    }

    //Our original method was "protected", so we can give either same or more visible.

    @Override
    public void quit() {
        System.out.println("Closing the Opera Browser");
    }

}
