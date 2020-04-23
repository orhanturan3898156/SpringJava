package Day25_Methods;

public class Warm_Up1_Driver {
    /*
    1. write a return method named getDriver1 that accepts a string parameter called Browser
    if the browser name matches with {"chrome", "firefox", "ie", "safari", "edge", "Opera"}, then it returns the name of that specific browser' driver
    Ex: getDriver("chrome");  ==> "Chrome Driver"
    getDriver("fireFOX"); ==> "FireFox Driver"
    ....
    if the browser name does not match with any of browsers above, the method should return "Invalid"
    APPLY SWITCH STATEMENTS
     */


    public static void main(String[] args) {


        String str = getDriver1("SAfari"); //this helps me to avoid case sensivity >>>(browserName.toLowerCase())

        System.out.println(str);


        String str2 = getDriver2("OpeRa");
        System.out.println(str2);

        String str3 = getDriver3("edge");
        System.out.println(str3);


    }

    public static String getDriver1(String browserName) {


        switch (browserName.toLowerCase()) {

            case "chrome":
                return "Chrome Driver";

            case "firefox":
                return "Firefox Driver";


            case "safari":
                return "Safari Driver";

            case "edge":
                return "Edge Driver";

            case "opera":
                return "Opera Driver";

            default:
                return "Invalid Driver";


        }


    }

    public static String getDriver2(String browserName) {
        browserName = browserName.toLowerCase();

        if (browserName.equals("chrome")) {
            return "Chrome Driver";
        } else if (browserName.equals("firefox")) {
            return "Firefox Driver";
        } else if (browserName.equals("safari")) {
            return "Safari Driver";

        } else if (browserName.equals("edge")) {
            return "Edge Driver";
        } else if (browserName.equals("opera")) {
            return "Opera Driver";
        } else {
            return "Invalid Driver";
        }


    }

    public static String getDriver3(String browserName) {
        browserName = browserName.toLowerCase();
        return  (browserName.equals("chrome")) ? "Chrome Driver" :
                (browserName.equals("safari")) ? "Safari Driver" :
                        (browserName.equals("opera")) ? "Opera Driver" :
                                (browserName.equals("firefox")) ? "Firefox Driver" :
                                        (browserName.equals("edge")) ? "Edge Driver" :
                                                "Not Valid";





    }

}
