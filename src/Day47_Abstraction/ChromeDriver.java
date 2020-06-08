package Day47_Abstraction;

public final class ChromeDriver extends Remote_WebDriver {
    //we extended it RemoveWebDriver
    @Override
    public void get(String URL) {
        System.out.println("Opening " + URL + " in the Chrome Driver");
    }

    //Our original method was "protected", so we can give either same or more visible.


    @Override
    public void quit() {
        System.out.println("Closing the Chrome Browser");
    }
}
