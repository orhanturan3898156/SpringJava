package Day11_Scanner;

public class WarmUp_Practice2_BrowserName_SwitchStatement {
    public static void main(String[] args) {
        String browsername = "chrome";
        String result = " ";
        //case must be mathced with swithc statements' expression .means string here
        switch (browsername) {
            case "chrome":
            case "Chrome":
                result = "Chrome is opening";
                break;
            case "Safari": //please make sure case input must be based on local variable.we used string here that's why use string
                result = "Safari is opening";
                break;
            case "Firefox":
                result = "Firefox is opening";
                break;
            case "Internet Explorer":
                result = "IE is opening";
                break;
            case "Opera":
                result = "Opera is opening";
                break;
            default:
                result = "Invalid";


        }
        System.out.println(result);
    }

}
