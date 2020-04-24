package Day14_String_Class;
public class String_Manipulation_Start_End_with {
    public static void main(String[] args) {
        String s1 = "United States";
        System.out.println(s1.startsWith("U"));
        System.out.println(s1.startsWith("u"));

        System.out.println("=================================\n");

        /*
        every website have http at the beginning of the web address
         */

        String website = "Http://google.com";
        website = website.toLowerCase();

        if (website.startsWith("http")) {
            System.out.println("Valid");

        } else {
            System.out.println("Invalid");
        }

        System.out.println("=================================\n");

        String s4 = "CyberTek School";
        System.out.println(s4.endsWith("l"));
        System.out.println(s4.endsWith("School"));
        System.out.println(s4.endsWith("CyberTek"));

        System.out.println("=================================\n");

        /*
        every single gmail address ends with @gmail.com
         */

        String gmail = "cybertekschool@yahoo.com";

        if (gmail.endsWith("@gmail.com")) {
            System.out.println("Valid");

        } else {
            System.out.println("Invalid");
        }
        System.out.println("=================================\n");
        /*
        valid address;
        must start with www.
        must end with .com, .edu,.org, .net,.or,.gov
         */

        String websiteaddress = "wWw.orHanturan.com";
        websiteaddress=websiteaddress.toLowerCase();

        if (websiteaddress.startsWith("www.")) {
            if (websiteaddress.endsWith(".com")
                    || websiteaddress.endsWith(".net")
                    || websiteaddress.endsWith(".org")
                    || websiteaddress.endsWith(".edu")
                    || websiteaddress.endsWith(".or")
                    || websiteaddress.endsWith(".gov"))

            {
                System.out.println(websiteaddress + ": is a valid address");

            }

        } else {
            System.out.println("invalid");
        }


    }
}
