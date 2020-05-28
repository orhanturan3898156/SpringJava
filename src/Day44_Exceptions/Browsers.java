package Day44_Exceptions;

public class Browsers {
    /*
    1. create a class called Browsers
       actions: openBrowser(): opens the default browser
       closeBrowser(): closes the default browser
    2. create a class called ChromeBrowser
       actions: openBrowser(): opens the chrome browser
       closeBrowser(): closes the chrome browser
    3. create a class called FirefoxBrowser
       actions: openBrowser(): opens the Firefox browser
       closeBrowser(): closes the Firefox browser
    4. create a class called Opera browser
       actions: openBrowser(): opens the Opera browser
       closeBrowser(): closes the Opera browser
    5. create a class called Test:
       create an object of each browsers and call the openBrowser & closeBrowser actions
     */

    protected void openBrowser() {
        System.out.println("opens the default browser");
    }

    protected void closedBrowser() {
        System.out.println("closes the default browser");
    }


}

class ChromeBrowser extends Browsers {

    //those two methods above cannot be inherited because they are private at first. Then we changed them to protected.
    @Override
    public void openBrowser() { //it can be either public or protected. same or more visible
        System.out.println("Opening the Chrome browser");
    }

    @Override
    protected void closedBrowser() {
        System.out.println("Closing the Chrome browser");
    }

}
class FirefoxBrowser extends  Browsers{
    protected void openBrowser() {
        System.out.println("opens the Firefox browser");
    }

    protected void closedBrowser() {
        System.out.println("closes the FireFox browser");
    }
}



class Test {


    public static void main(String[] args) {
        //we will check if it works when we switch protected from private.
        ChromeBrowser obj = new ChromeBrowser();
        obj.openBrowser();
        obj.closedBrowser();

        System.out.println("================================");

        FirefoxBrowser obj2=new FirefoxBrowser();
        obj2.openBrowser();
        obj2.closedBrowser();





    }

}