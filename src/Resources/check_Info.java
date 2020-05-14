package Resources;

import Day39_Acces_Modifier.Personal_Info;

public class check_Info {
    public static void main(String[] args) {

        System.out.println("Name: " + Personal_Info.name);//name is "static" and we can call it through class name. no need to create an object.
        System.out.println("Gender: " + Personal_Info.gender);

        //System.out.println("Grade: "+Personal_Info.grade); grade is deafult. and default is accesible in the same package only.

        // System.out.println("SSN: "+Personal_Info.SSN);SSN is private and can be reached in the same class only.

        Personal_Info obj=new Personal_Info();
        System.out.println(Personal_Info.name);
        System.out.println(Personal_Info.gender);

       // System.out.println(Personal_Info.grade); access modifier is default for grade. and default can be called only inthe same package
        //same for the age.

        //SSN and ID can be called only in the same class.





    }
}
