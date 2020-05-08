package Day36_Static_Block;

import Day34_Custom_Class.Tester;

public class Static_Block4 {
    static String name;
    static Tester tester1 = new Tester();
    /*
    tester1.setTesterInfo >>>it doesnt come up because you cannot call it here.you need to call it in static block
    Shortly, if it takes more than one steps to initizale, you should you in static block

     */

    int insVariable;


    static {

        //whatever statement gives here , it will be executed first.
        //designed to initialize static variable
        //static only accepts static variables like above. IMPORTANT

        name = "CyberTek School";
        tester1.setTesterInfo("Muhtar", 124, "Developer", 120000);


        /*
        Static_Block4 obj1=new Static_Block4();//you have to create an object to be able to call instance variables.
        obj1.insVariable=300;  //>>>if you want to call instance varibale this is the way.
        // Don't use it. not give you expected result. We WILL NOT USE IT ANYWHERE .don't worry
        */

    }

    public static void main(String[] args) {
        System.out.println(name);//CyberTek School

        System.out.println(tester1);

        /*Static_Block4 obj2=new Static_Block4();
        System.out.println(obj2.insVariable);
         */
    }
}
