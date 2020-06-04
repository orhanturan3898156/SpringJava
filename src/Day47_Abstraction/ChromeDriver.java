package Day47_Abstraction;

public class ChromeDriver extends Remote_WebDriver {
    //we extended it RemoveWebDriver
    @Override
    public void get(String URL) {
        System.out.println("Opening " + URL + " int he Chrome Driver");
    }

    //Our original method was "protected", so we can give either same or more visible.

}
