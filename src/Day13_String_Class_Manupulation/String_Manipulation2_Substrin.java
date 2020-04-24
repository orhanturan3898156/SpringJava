package Day13_String_Class_Manupulation;

public class String_Manipulation2_Substrin {
    public static void main(String[] args) {

        String str = "CyberTek is the best";
        String schooolName = str.substring(0, 7); ///it doesnt include the last one
        System.out.println(schooolName);

        String fullname = "Kuzzat Altay";
        String firstname = fullname.substring(0, 6);
        String lastname = fullname.substring(7, 12);  //let 's if you give (7,59) it gives compile errror. because there is no that much index
        System.out.println(firstname);
        System.out.println(lastname);

        System.out.println("=================================\n");
        String fullname2= "Murtaza Nazeeri";
        String first=fullname2.substring(0,7);
        String last=fullname2.substring(8,15);
        String gmail=last.concat("_").concat(first).concat("@gmail.com").toLowerCase();

        System.out.println(gmail);

        System.out.println("=================================\n");

        String s1="I love Java Programming Language";
        String classname=s1.substring(7);
        System.out.println(classname);


        System.out.println("=================================\n");

        //REPLACE
        String s2="I like C# Programming";
        s2=s2.replace("C#","Java");//if you have more than one C# it will replace all of them.
        System.out.println(s2);

        String name="COVID 18";
        name=name.replace("18","19");
        System.out.println(name);

        System.out.println("=================================\n");

        //REPLACEFIRST----> it only replace the first one , but not others.
        String r1= "I like C#,C# is fun, C# is coool";
        r1=r1.replaceFirst("C#","Java");
        System.out.println(r1);

        String r2="Tomorrow is Monday, Tomorrow is Tuesday";
        r2=r2.replaceFirst("tomorrow","Today");
        System.out.println(r2);





    }
}

