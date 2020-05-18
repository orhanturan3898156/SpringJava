package Day39_Acces_Modifier;

public class Check_Info {
    public static void main(String[] args) {

        System.out.println("Name is " + Personal_Info.name);
        System.out.println("Gender is " + Personal_Info.gender);

        //System.out.println("Grade is "+Personal_Info.grade);
        //same for SSN, ID ,
        //private is only accesible in the same class.

        Personal_Info obj = new Personal_Info();
        System.out.println(obj.name);
        System.out.println(obj.gender);
        System.out.println(obj.grade);

/*
        System.out.println(Personal_Info.a);//100
        System.out.println(obj.b);//200

 */


    }
}
