package Day12_Recap_Scanner_Switch_Ternary;

import java.util.Scanner;

public class Ternary_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Status Code");
        /*
        200, OK
        201, Created
        202, Accepted
        301, Moved Permanently
        303, See Other
        304, Not Modified
        307, Temporary Redirect
        400, Bad Request
        401, Unauthorized
        403, Forbidden
        404, Not Found
        410, Gone
        500, Internal Server Error
        503, Service Unavailable*/
        int status = scan.nextInt();
        String result = "";
        if (status == 200) {
            result = " OK";
        } else if (status == 201) {
            result = "Created";
        } else if (status == 202) {
            result = "Accepted";
        } else if (status == 301) {
            result = "Moved Permanently";
        } else {
            result = "Invalid";
        }
        System.out.println(result);

        int status2=scan.nextInt();
        String result2=(status2==200)? "OK":(status2==201)? "Created":(status2==301)? "Accepted":(status2==301)? "Moved":"Invalid";
        System.out.println(result2);

    }
}
